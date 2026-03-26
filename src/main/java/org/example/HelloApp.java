package org.example;

public class HelloApp {
    public static void main(String[] args) {

        String output;

        // Check if any arguments are provided
        if (args.length > 0) {
            // Join all names with comma and space
            String names = String.join(", ", args);
            output = "Hello, " + names + "!";
        } else {
            // Default case
            output = "Hello, World!";
        }

        // Print final output
        System.out.println(output);
    }
}