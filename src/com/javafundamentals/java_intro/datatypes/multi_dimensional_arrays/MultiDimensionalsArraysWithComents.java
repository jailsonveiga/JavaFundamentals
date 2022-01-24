package com.javafundamentals.java_intro.datatypes.multi_dimensional_arrays;

import java.util.Arrays;

public class MultiDimensionalsArraysWithComents {
    public static void main(String[] args) {
        int[][] numArrays = new int[2][3];// 2 dimensional arrays 2 rows and 3 columns matrix

        numArrays[0][0] = 1; // go to first row, first column and initialize value of 1 into numArray

        System.out.println(Arrays.deepToString(numArrays));//deepToString to printing multi-dimensional arrays

        // 3 dimensional arrays

        int [][] numArrays1 = {{1, 2, 3}, {4, 5, 6}}; // 2 dimensional arrays using curly braces

        System.out.println(Arrays.deepToString(numArrays1)); //deepToString - to print multidimensional arrays
    }
}
