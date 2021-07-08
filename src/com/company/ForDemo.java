package com.company;


import java.util.Scanner;

public class ForDemo {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Counting " + i);

            System.out.println("Do you want to cancel?");
            var answer = scanner.next();

            if (answer.equalsIgnoreCase("yes")) {
                break;
            }
        }
        System.out.println("Good bye!");
    }

}
