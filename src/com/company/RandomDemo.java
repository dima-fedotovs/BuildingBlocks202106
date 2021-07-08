package com.company;


import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) {
        var random = new Random();

        for (int i = 0; i < 10; i++) {
            var num = random.nextInt(100) + 1;
            System.out.println(num);
        }

    }

}
