package com.teachmeskills.lesson05;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[][] matrix1 = {{1,0,0,0},{0,1,0,0},{0,0,0,0}};
        //output matrix1 in console in normal view
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] matrix2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        //output matrix2 in console in normal view
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

//        //multiply matrix1 and matrix2 and output result in console
//        int[][] result = new int[matrix1.length][matrix2[0].length];
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1[0].length; j++) {
//                for (int k = 0; k < matrix2[0].length; k++) {
//                    result[i][k] += matrix1[i][j] * matrix2[j][k];
//                }
//            }
//        }
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(Arrays.toString(result[i]));
//        }
//        System.out.println();

        //multiply matrix1 and matrix2
        int[][] result2 = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2[0].length; k++) {
                    result2[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2[i].length; j++) {
                System.out.print(result2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
