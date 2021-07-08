package com.company;

import java.util.Scanner;

public class StringEqualsDemo {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        var name = scanner.next();

        System.out.println("Enter your age");
        var age = scanner.nextInt();

        if (name.equalsIgnoreCase("John") || name.equals("admin")) {
            System.out.println("You are John! (or admin)");
        } else {
            System.out.println("You are NOT John!");
        }

        if (name.equalsIgnoreCase("Mike") && age > 100) {
            System.out.println("You are too old, Mike!");
        }

    }

}
