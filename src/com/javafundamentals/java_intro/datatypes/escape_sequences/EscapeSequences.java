package com.javafundamentals.java_intro.datatypes.escape_sequences;

public class EscapeSequences {
    public static void main(String[] args) {
        String message = "- Hello \"World\"";
        String message1 = "- Hello \\ World";
        String message2 = "- Hello\n  World";
        String message3 = "- Hello\tWorld";

        System.out.println(message);
        System.out.println(message1);
        System.out.println(message2);
        System.out.println(message3);
    }
}
