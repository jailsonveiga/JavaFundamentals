package com.javafundamentals.java_intro.datatypes.reference_datatypes;

import java.util.Date; // importing the Date class in this package

public class ReferenceDataTypeWithComments {
   public static void main(String[] args) {
        Date now = new Date(); // assigning the value of Date class into variable now
                               // Date class is a Reference Data Type
                               // Date() construct date object
                                // new operator is a java keyword to allocate memory
                               // variable name now is an instance of date class "blueprint, template" for creating new object
        System.out.println("Today's Date: " + now);
    }
}
