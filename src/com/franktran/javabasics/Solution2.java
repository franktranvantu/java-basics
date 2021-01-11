package com.franktran.javabasics;

import java.io.Console;

public class Solution2 {

    public static void main(String[] args) {
        // Declare another variable, naming this one the camel-cased version of "last name".
        // Use console.readLine to store the user's last name into this new variable.

        Console console = System.console();
        String firstName;
        String lastName;
        firstName = console.readLine();
        lastName = console.readLine();

    }
}
