package com.franktran.javabasics;

import java.io.Console;

public class Solution1 {

    public static void main(String[] args) {
        // Create a new variable called name and accept input from the console using the readLine method.
        Console console = System.console();
        String name = console.readLine("Enter your name: ");
    }
}
