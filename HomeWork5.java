package ru.geekbrais.lesson3;

/**
 * Java. Level 1. Lesson 5. Homework 5
 *
 * @author Artyom Emelyanov
 * @version dated Jen 27, 2019
 */

public class HomeWork5 {

    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];

        emplArray[0] = new Employee("Aleksandr Privalov", "programmer", "privalovAI@niichavo.ru",
                "89519128731", 235, 25);
        emplArray[1] = new Employee("Yanus Nevstruev", "director", "nevstruevYP@niichavo.ru",
                "831415926835", 1000, 88);
        emplArray[2] = new Employee("Amvrosiy Vibigallo", "professor", "vibigalloAA@niichavo.ru",
                "83519050403", 800, 64);
        emplArray[3] = new Employee("Naina Gorinich", "custodian", "gorinichNK@niichavo.ru",
                "85192365121", 600, 35);
        emplArray[4] = new Employee("Roman Oyra-Oyra", "wizard", "oyra-oyraRP@niichavo.ru",
                "89565666688", 300, 61);
            for (int i=0;i<emplArray.length;i++) {
                if (emplArray[i].age>40) {
                    System.out.println(emplArray[i]);
                }
            }
    }
}

    class Employee {
        private String name;
        String appointment;
        String email;
        String phone_number;
        int wage;
        int age;

        Employee(String name, String appointment, String email, String phone_number, int wage, int age) {
            this.name = name;
            this.appointment = appointment;
            this.email=email;
            this.phone_number=phone_number;
            this.wage=wage;
            this.age = age;
        }

        String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Full name: " + getName() + ", appointment: " + appointment + ", E-mail: " + email + ", phone number: "
                    + phone_number + ", wage: " + wage + "$ , age: " + age;
        }
    }
