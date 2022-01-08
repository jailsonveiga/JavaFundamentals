package com.javafundamentals.java_intro.datatypes.primitive_datatypes;

public class PrimitiveDataTypesWithComments {
    public static void main(String[] args) {
         // number data type
        byte age = 20; // Assign an initial value of 20 as a byte data type into a variable name age
                      // byte takes 1 bytes and allow us to store values up to 127

        int likesCount = 1_000_000; //likesCount name identifier is a camelCaseNameConvention Every letter of each word should be uppercase except the first word
                                  // Assign an initial value of 1million as an integer data type into a variable likesCount
                                  // int takes 4 bytes and allow us to store values up to 2billion
                                  // In java when we are working with a large values like 1000000 we can separate every 3 digits with underscore. it will make our values more readable

       long countBottle = 3_123_456_789L; //countBottle name identifier is a camelCaseNameConvention Every letter of each word should be uppercase except the first word
                                          // Assign an initial value of 3billion as a long data type into variable countBottle
                                          // long data type we need to add a suffix lowercase or uppercase letter "l" "L" at the end of our values. If we don't add the letter "l" "L" java will see the value as an integer data type as a default and will show an error

        float price = 9.99F; //Assign an initial value of 9.99 as a float data type into variable price
                             // float data type we need to add a suffix lowercase or uppercase letter "f" "F" at the end of the value. If we don't add the letter "l" "L" java will see the value as double data type as a default and will show an error

         // character data type
        char strText = 'S'; //Always surround a char data type value with a single quote and single character inside

        boolean isItTrue = true; // true reserved Keyword in java
                                 // value can be true ot false all lowercase

        System.out.println("byte data type: " + age);
        System.out.println("Integer data type: " + likesCount);
        System.out.println("long data type: " + countBottle);
        System.out.println("float data type: " + price);
        System.out.println("char data type: " + strText);
        System.out.println("boolean data type: " + isItTrue);

    }
}
