package com.franktran.javabasics;

import java.io.Console;

/**
 * @author frank.tran
 */
public class Challenge3 {

    public static void main(String[] args) {
        // Inside your if block, after printing, exit the program.
        Console console = System.console();
        int numberOfPeople = 3;
        if (numberOfPeople < 4) {
            console.printf("Your table is ready");
        }
    }
}
