package com.teachmeskills.lesson05;

public class Task4 {
    public static void main(String[] args) {

        //create two-dimention array
        int[][] array = new int[5][5];

        //fill array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //output the diagonal elements in the console
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
