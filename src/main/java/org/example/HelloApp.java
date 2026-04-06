package org.example;

public class HelloApp {
    public static void main(String[] args) {

        String output;

        // If no arguments → default
        if (args.length == 0) {
            output = "Hello, World!";
        } else {
            // Join all names with ", "
            String names = String.join(", ", args);
            output = "Hello, " + names + "!";
        }

        // Print result
        System.out.println(output);
    }
}