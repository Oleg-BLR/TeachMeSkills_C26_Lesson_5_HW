package com.teachmeskills.lesson05;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //create two-dimention array
        int[][] array = new int[5][5];

        //fill array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); //print empty line for better view of array in console
        }
        //calculate sum of elements in array
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
//        int sum2 = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum2 += Arrays.stream(array[i]).sum();
//
//        }
        System.out.println(sum);
//        System.out.println(sum2);
    }
}
