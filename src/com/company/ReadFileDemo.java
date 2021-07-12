package com.company;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileDemo {

    public static void main(String[] args) {
        var file = new File("test.txt");
        try (var scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                var attributeName = scanner.next();
                var attributeValue = scanner.next();
                System.out.printf("This is from the file: %s = %s\n", attributeName, attributeValue);
            }
        } catch (IOException e) {
            System.out.println("Cannot read from file");
        }
    }

}
