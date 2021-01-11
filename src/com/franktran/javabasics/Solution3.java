package com.franktran.javabasics;

import java.io.Console;

/**
 * @author frank.tran
 */
public class Solution3 {

    public static void main(String[] args) {
        // Finally, using console.printf print out a formatted string that says
        // "Because you said <response>, you passed the test!"
        Console console = System.console();
        String response;
        do {
            response = console.readLine("Do you understand do while loops? ");
        } while (response.equalsIgnoreCase("No"));
        console.printf("Because you said %s, you passed the test!", response);
    }
}
