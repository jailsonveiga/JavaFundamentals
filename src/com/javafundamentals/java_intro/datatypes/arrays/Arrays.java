package com.javafundamentals.java_intro.datatypes.arrays;

public class Arrays {
    public static void main(String[] args){

        int[] numbers = new int[3];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println(java.util.Arrays.toString(numbers));

        System.out.println("---------------------");

        //new way Array creation
        int[] numbersArray = {1, 2, 3};

        System.out.println(numbersArray.length);

        System.out.println("---------------------");

        //Array sort()
        int[] sortArray = {5, 2, 4, 1, 3};

        java.util.Arrays.sort(sortArray);

        System.out.println(java.util.Arrays.toString(sortArray));

    }
}
