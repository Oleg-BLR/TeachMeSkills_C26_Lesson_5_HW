package com.teachmeskills.lesson05;

/**
 * Создайте двумерный массив целых чисел. Выведите на консоль сумму
 * 	всех элементов массива.
 */
public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }
}
