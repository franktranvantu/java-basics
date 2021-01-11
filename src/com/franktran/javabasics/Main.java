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
        String name = console.readLine("Enter a name: ");
        String adjective = console.readLine("Enter an adjective: ");
        String noun = console.readLine("Enter a noun: ");
        if (name.equalsIgnoreCase("dork")) {
            console.printf("That language is not allowed. Exiting.");
            System.exit(0);
        }
        String adverb = console.readLine("Enter a adverb: ");
        String verb = console.readLine("Enter a verb ending in -ing: ");

        console.printf("Your summary:\n");
        console.printf("---------------\n");
        console.printf("%s is a %s %s. ", name, adjective, noun);
        console.printf("The are always %s %s\n", adverb, verb);
    }
}
