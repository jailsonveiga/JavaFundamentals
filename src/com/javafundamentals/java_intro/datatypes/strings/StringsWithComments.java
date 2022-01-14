package com.javafundamentals.java_intro.datatypes.strings;

public class StringsWithComments {
    public static void main(String[] args) {
        String str = "Hello World"; // "hello World" is a string literal
                                   // assigning the value of our string literal into variable str

        String message = "Hello"; //assign value of this string literal into message variable
        String message1 = "World";//assign value of this string literal into message variable

        String messageFullName = message + " " + message1; // (+) means we are concatenating message and message1 together and store the value inside messageFullName
                                                           // (" ") this empty quotes is to leave blank space between our variable
        System.out.println(str); //we are passing variable str to the print line method

        System.out.println("--------------------------");

        System.out.println(messageFullName); // print out the value of messageFullName variable
    }
}
