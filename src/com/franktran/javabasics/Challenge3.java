package com.franktran.javabasics;

import java.io.Console;

public class Challenge3 {

    public static void main(String[] args) {
        // Output a sentence that takes both the name and past tense verb using a single statement.
        // It should look like this: *name* really *past tense verb* this coding exercise.
        Console console = System.console();
        String name = console.readLine("Enter your name: ");
        String pastTenseVerb = console.readLine("Enter a past tense verb: ");
    }
}
