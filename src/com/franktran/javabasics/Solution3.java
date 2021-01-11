package com.franktran.javabasics;

import java.io.Console;

public class Solution3 {

    public static void main(String[] args) {
        // Using the console's printf method, display a message that says, "First name: ", followed by
        // the first name that the user has entered.

        Console console = System.console();
        String firstName;
        String lastName;
        firstName = console.readLine();
        lastName = console.readLine();
        console.printf("First name: %s", firstName);
    }
}
