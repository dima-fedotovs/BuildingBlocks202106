package com.company;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Number");
        var num = scanner.nextInt();

        System.out.println("Enter your name");
        var userName = scanner.next();
//        var userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
        System.out.println("Your number is " + num);
    }

}
