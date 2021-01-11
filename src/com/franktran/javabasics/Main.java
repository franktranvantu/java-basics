package com.franktran.javabasics;

import java.io.Console;

/**
 * @author frank.tran
 */
public class Main {

    public static void main(String[] args) {
        Console console = System.console();
        String ageAsString = console.readLine("How old are you? ");
        int age = Integer.parseInt(ageAsString);
        if (age < 13) {
            console.printf("Sorry, you must be at least 13 to use this program.\n");
            System.exit(0);
        }
        String name = console.readLine("Enter your name: ");

    }
}
