package com.franktran.javabasics;

import java.io.Console;

/**
 * @author frank.tran
 */
public class Main {

    public static void main(String[] args) {
        Console console = System.console();
        String name = console.readLine("Enter a name: ");
        String adjective = console.readLine("Enter an adjective: ");
        String noun;
        boolean isInvalidWord;
        do {
            noun = console.readLine("Enter a noun: ");
            isInvalidWord = name.equalsIgnoreCase("dork") ||
                    name.equalsIgnoreCase("jerk");
            if (isInvalidWord) {
                console.printf("That language is not allowed. Try again.");
            }
        } while (isInvalidWord);
        String adverb = console.readLine("Enter a adverb: ");
        String verb = console.readLine("Enter a verb ending in -ing: ");

        console.printf("Your summary:\n");
        console.printf("---------------\n");
        console.printf("%s is a %s %s. ", name, adjective, noun);
        console.printf("The are always %s %s\n", adverb, verb);
    }
}
