package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileDemo {

    public static void main(String[] args) {
        var testFile = new File("test.txt");
        try (var out = new PrintWriter(testFile)) {
            out.println("12345");
            out.println("Hello, World!");
            out.println("I'm writing to file");
        } catch (IOException e) {
            System.out.println("Sorry, something wrong");
        }
    }

}
