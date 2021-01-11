package com.franktran.javabasics;

import java.io.Console;

/**
 * @author frank.tran
 */
public class Challenge2 {

    public static void main(String[] args) {
        // Add another if statement that checks if the firstExample is equal ignoring case to thirdExample.
        // If it, is print out "first and third are the same ignoring case".
        Console console = System.console();
        String firstExample = "hello";
        String secondExample = "hello";
        String thirdExample = "HELLO";

        if (firstExample.equals(secondExample)) {
            console.printf("first is equal to second");
        }
    }
}
