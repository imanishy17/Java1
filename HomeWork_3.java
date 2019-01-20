package ru.geekbrais.lesson3;

/**
 * Java. Level 1. Lesson 3. Homework 3
 *
 * @author Artyom Emelyanov
 * @version dated Jen 20, 2019
 */

import java.util.Random;
import java.util.Scanner;

public class HomeWork_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int answer = 1;
        while (answer == 1) {
            int number = rand.nextInt(10);
            System.out.println("Я загадал число от 0 до 9. Попытайся его угадать. У тебя будет 3 попытки.");
            for (int counter = 1; counter <= 3; counter++) {
                System.out.println("Попытка № " + counter);
                int inputNuber = scanner.nextInt();
                    if (inputNuber == number) {
                        System.out.println("Угадано!!!");
                        break;
                    } else if (inputNuber > number) {
                        System.out.println("Загаданное число меньше.");
                    } else {
                        System.out.println("Загаданное число больше.");
                    }
                    if (counter==3){
                    System.out.println("Попытки кончились, ты проиграл");
                    }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            answer = scanner.nextInt();
        }
    }
}