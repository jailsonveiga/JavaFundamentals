package com.javafundamentals.java_intro.datatypes.escape_sequences;

public class EscapeSequencesWithComments {
    public static void main(String[] args) {
        String message = "- Hello \"World\""; // we use back-slash if we want to wrap "world" within quotes
        String message1 = "- Hello \\ World";// add a back-slash between Hello and World "Hello \ World"
        String message2 = "- Hello\n  World"; // back-slash "n" java will insert a new line
        String message3 = "- Hello\tWorld"; // back-slash "t" java will insert a tab blank space

        System.out.println(message); //print out the message value to the terminal
        System.out.println(message1);//print out the message value to the terminal
        System.out.println(message2);//print out the message value to the terminal
        System.out.println(message3);//print out the message value to the terminal
    }
}
