package com.franktran.javabasics;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        PrintStream ps = System.out;
        String name = "Frank";
        ps.printf("Hello, My name is %s\n", name);
        ps.printf("%s is learning how to write Java\n", name);
    }
}
