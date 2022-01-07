package com.javafundamentals.java_intro.datatypes.variables;

public class VariablesWithComments {
    public static void main(String[] args) {
        //In Java, we end a statement adding a semicolon ";"
        int age = 30; // We are assigning the value of the integer 30 to an identifier age
        age = 35; // Changing the integer initial value of "30" to 35

        //Initializing multiple variable in the same line
        int temperature = 20, day = 3; // 2 variable with the same data type "int"

        //How to copy one variable into another variable
        int intNum = 58; // "intNum" is a camelCaseNamingConvention "Every letter of each word should be uppercase except the first word"
        int num = intNum; // Copy the value of variable "intNum" "58" and assign into the variable "num"

        System.out.println(age); //print out the value of age "30" to the terminal
        System.out.println(temperature);//print out the value of temperature "20" to the terminal
        System.out.println(day);//print out the value of day "3" to the terminal
        System.out.println(num);//print out the value od num "55" to the terminal

    }
}
