package com.javafundamentals.java_intro.datatypes.primitive_vs_reference_datatype;

import java.awt.*; //package import point statement

public class PrimitiveVsReferenceDataTypeWithComments {
    public static void main(String[] args) {
        //Primitive Data Type
        byte x = 1; //Primitive Data Type we are assigning value of 1 into variable x
        byte y = x; // Primitive Data Type We are assigning value of variable x into variable y
                    // variable x and variable y are stored in different memory location
                    // they are completely independent of each other
        x = 2; // if we change value of x, y is not going to get affected

        System.out.println(y); // print out -> 1 to the terminal
        System.out.println(x); // print out -> 2 to the terminal

        //primitive types are copied by their value
        //these values are completely independent of each other

        System.out.println("---------------------------");

        //Reference Data Type
        Point point1 = new Point(1, 1); // inside the point parenthesis we can pass initial values for x and y
                                            // intellij automatic add is label for x and y
        Point point2 = point1;              // we are copying the value of variable point1 into variable point2

        point1.x = 2;                       // we use the (.) operator to see the members of this object (x, y)
                                            // we are assigning a value os 2 into a variable (x) from is initial value

        System.out.println(point2); // print out the value of variable point2 to the terminal
        System.out.println(point1); // print out the value of variable point2 to the terminal

        //Reference types are copied by the references
    }
}
