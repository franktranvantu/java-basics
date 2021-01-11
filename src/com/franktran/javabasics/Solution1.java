package com.franktran.javabasics;

import java.io.Console;

/**
 * @author frank.tran
 */
public class Solution1 {

    public static void main(String[] args) {
        // Prompt the user with the question "Do you understand do while loops?"
        // Store the result in a new String variable named response.
        Console console = System.console();
        String response = console.readLine("Do you understand do while loops? ");
    }
}
