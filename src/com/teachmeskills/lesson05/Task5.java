package com.teachmeskills.lesson05;

import java.util.Arrays;

/**
 * Создайте двумерный массив целых чисел. Отсортируйте элементы в
 * 	строках двумерного массива по возрастанию.
 */
public class Task5 {

    public static void main(String[] args) {

        //create two-dimention array
        int[][] array = new int[5][5];

        //fill array with random numbers
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //sort elements in lines of the array
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }

        //output of sorted array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    }
}
