package ru.geekbrais.lesson2;

/**
 * Java. Level 1. Lesson 2. Homework 2
 *
 * @author Artyom Emelyanov
 * @version dated Jen 17, 2019
 */
import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {

        invert();
        create();
        multiply();
        filDiagonal();
        max_min();
        int[] balance = {1,2,3,5,9,2};
                System.out.println(checkBalance(balance));
    }

        public static void invert(){

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
            }
//
            System.out.println(Arrays.toString(arr));
        }

        public static void create() {
        int[] three = new int[8];
        int a=0;
        for (int i=0; i<three.length; i++) {
            three[i]= a;
            a+=3;
        }
            System.out.println(Arrays.toString(three));
        }

        public static void multiply() {
        int[] six = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i<six.length; i++) {
            if (six[i]<6) {
                six[i]=six[i]*2;
            }
        }
            System.out.println(Arrays.toString(six));
        }

        public static void filDiagonal() {
        int [][] diog = new int[4][4];
        for (int i=0; i<diog.length; i++) {
            for (int j=0; j<4 ; j++) {
                if (i==j || i+j==diog.length-1) {
                    diog[i][j]=1;
                } else diog[i][j]=0;
                System.out.print(diog[i][j] + " ");
            }
            System.out.println();
            }
        }

        public static void max_min() {
            int[] arr = {1, 5, 3, 2, -11, 4, -5, 2, 4, 0, -9, 1};
            int max= arr[0];
            int min= arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]>max) {
                    max=arr[i];
            } else if(arr[i]<min) {
                    min=arr[i];
                }

        }
            System.out.println("Min= " + min);
            System.out.println("Max= " + max);

        }

        public static boolean checkBalance(int[] balance) {

            int summ_left = 0;
            boolean equality = false;
            for (int i = 0; i < balance.length; i++) {
                int summ_right = 0;
               summ_left = balance[i]+summ_left;
               for (int j = i+1; j < balance.length; j++) {
                   summ_right=balance[j]+summ_right;
               }
                if (summ_left==summ_right) {
                    equality=true;
                }
            }
            return equality;
            }
    }


