package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionDemo {
    public static void main(String[] args) {
        var regList = new ArrayList<RegistrationForm>();
        var scanner = new Scanner(System.in);
        System.out.println("Do you want to add a registration?");
        while (scanner.next().equalsIgnoreCase("yes")) {
            var reg = new RegistrationForm();
            System.out.println("First Name");
            reg.firstName = scanner.next();
            System.out.println("Last Name");
            reg.lastName = scanner.next();
            System.out.println("Age");
            reg.age = scanner.nextInt();

            regList.add(reg);

            System.out.println("Do you want to repeat?");
        }

        System.out.println("All registrations:");
        for(var reg : regList) {
            System.out.printf("%s %s %d\n", reg.firstName, reg.lastName, reg.age);
        }

    }
}
