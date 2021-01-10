package com.franktran.javabasics;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Console console = System.console();
        String name = "Frank";
        console.printf("Hello, My name is %s\n", name);
        console.printf("%s is learning how to write Java\n", name);
    }
}
