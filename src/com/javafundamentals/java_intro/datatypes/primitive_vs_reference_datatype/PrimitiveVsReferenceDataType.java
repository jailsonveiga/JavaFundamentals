package com.javafundamentals.java_intro.datatypes.primitive_vs_reference_datatype;

import java.awt.*;

public class PrimitiveVsReferenceDataType {
    public static void main(String[] args) {

        byte x = 1;
        byte y = x;

        x = 2;

        System.out.println(y);
        System.out.println(x);

        System.out.println("---------------------------");

        Point point1 = new Point(1, 1);
        Point point2 = point1;

        point1.x = 2;

        System.out.println(point2);
    }
}
