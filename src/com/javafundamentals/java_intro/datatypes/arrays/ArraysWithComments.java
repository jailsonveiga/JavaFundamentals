package com.javafundamentals.java_intro.datatypes.arrays;

import java.util.Arrays;

public class ArraysWithComments {
    public static void main(String[] args){
        //old wat Array creation
        int[] numbers = new int[3]; // [] refers to integer array
                                   // we add a new operator because array is a reference type
                                   // [5] this array will take 5 elements
        numbers[0] = 1; //assign a value of 1 into the first index of variable numbers
        numbers[1] = 2;//assign a value of 2 into the second index of variable numbers
        numbers[2] = 3;//assign a value of 3 into the third index of variable numbers

        System.out.println(Arrays.toString(numbers));// print out the values from the numbers variable

        System.out.println("---------------------");

        //new way Array creation
        int[] numbersArray = {1, 2, 3}; //assigning 3 elements with their values into variable numbersArray

        System.out.println(numbersArray.length);// the length of numbersArray variable

        System.out.println("---------------------");

        //Array sort()
        int[] sortArray = {5, 2, 4, 1, 3}; // initialize an array

       Arrays.sort(sortArray);//sort an array

       System.out.println(Arrays.toString(sortArray));//print out the value of sortArray variable in a terminal

    }
}
