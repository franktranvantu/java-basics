package com.franktran.javabasics;

import java.io.Console;

/**
 * @author frank.tran
 */
public class Challenge2 {

    public static void main(String[] args) {
        // Now continually prompt the user in a do while loop.
        // The loop should continue running as long as the response is No.
        // Don't forget to declare response outside of the do while loop.
        Console console = System.console();
        String response = console.readLine("Do you understand do while loops? ");
    }
}
