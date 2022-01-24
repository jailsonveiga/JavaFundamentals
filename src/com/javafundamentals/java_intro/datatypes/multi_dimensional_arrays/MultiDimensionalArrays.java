package com.javafundamentals.java_intro.datatypes.multi_dimensional_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] numArrays = new int[2][3];

        numArrays[0][0] = 1;

        System.out.println(Arrays.deepToString(numArrays));

        int [][] numArrays1 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.deepToString(numArrays1));
    }
}
