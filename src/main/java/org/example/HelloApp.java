package org.example;

public class HelloApp {
    public static void main(String[] args) {

        String output;

        // If no arguments → default
        if (args.length == 0) {
            output = "Hello, World!";
        } else {
            // Build names using enhanced for loop
            StringBuilder names = new StringBuilder();

            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }

            output = "Hello, " + names.toString() + "!";
        }

        // Print result
        System.out.println(output);
    }
}