package com.teachmeskills.lesson05;

import java.util.Arrays;
import java.util.Scanner;

/*
Создать трехмерный массив из целых чисел.
	С помощью циклов "пройти" по всему массиву и увеличить каждый
	элемент на заданное число. Пусть число, на которое будет
	увеличиваться каждый элемент, задается из консоли.
 */
public class Task0 {
    public static void main(String[] args) {
        int[][][] array = new int[3][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = i;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input natural number");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = array[i][j][k] + number;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
