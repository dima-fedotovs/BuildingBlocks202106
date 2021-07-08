package com.company;

import java.util.Scanner;

public class DoWhileDemo {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Hello!");

        do {
            System.out.println("Doing something");
            System.out.println("Do you want to repeat?");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Good bye!");
    }
}
