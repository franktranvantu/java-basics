package com.franktran.javabasics;

import java.io.Console;

public class Introductions {

    public static void main(String[] args) {
        Console console = System.console();
        String name = console.readLine("What is your name? ");
        console.printf("Hello, My name is %s\n", name);
        console.printf("%s is learning how to write Java\n", name);
    }
}
