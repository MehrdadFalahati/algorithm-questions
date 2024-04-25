package com.mehrdad.falahati.algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaddlePoint {

    private static int[][] matrix1 = {
            {4, 16, 12},
            {2, 8, 14},
            {1, 3, 6}};

    private static int[][] matrix2 = {
            {10, 12, 7, 3, 12},
            {3, 10, 6, 2, 8},
            {18, 24, 17, 6, 10},
            {15, 21, 10, 8, 12},
            {1, 18, 22, 4, 15}};

    private static int[][] matrix3 = {
            {2, 5, 6, 9},
            {8, 4, 12, 3},
            {6, 7, 3, 1},
            {12, 24, 2, 11}};

    public static void main(String[] args) {
        find(matrix1);
        find(matrix2);
        findRevers(matrix2);
        find(matrix3);
    }

    public static void find(int[][] matrix) {
        int[] min = new int[matrix.length];
        int[] max = new int[matrix.length];
        int index = 0;
        Arrays.fill(min, Integer.MAX_VALUE);
        Arrays.fill(max, Integer.MIN_VALUE);


        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                min[index] = Math.min(min[index], matrix[i][j]);
                max[index] = Math.max(max[index], matrix[j][i]);
            }
            index++;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (min[i] == max[i])
                System.out.println(max[i]);
        }
    }

    public static void findRevers(int[][] matrix) {
        int[] min = new int[matrix.length];
        int[] max = new int[matrix.length];
        int index = 0;
        Arrays.fill(min, Integer.MAX_VALUE);
        Arrays.fill(max, Integer.MIN_VALUE);


        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                max[index] = Math.max(max[index], matrix[i][j]);
                min[index] = Math.min(min[index], matrix[j][i]);
            }
            index++;
        }


        for (int i = 0; i < matrix.length; i++) {
            if (min[i] == max[i])
                System.out.println(max[i]);
        }
    }

    public static void findSaddlePoints(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int rowMin = Integer.MAX_VALUE;
            int colIndex = -1;

            // Find the minimum value in the current row
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }

            // Check if the minimum value is also the maximum in its column
            boolean isSaddlePoint = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][colIndex] > rowMin) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if (isSaddlePoint) {
                System.out.println("Saddle point found at (" + i + ", " + colIndex + "): " + rowMin);
            }
        }
    }

}
