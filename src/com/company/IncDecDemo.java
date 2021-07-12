package com.company;

public class IncDecDemo {

    public static void main(String[] args) {
        int i = 5;
        System.out.println(i++);
        System.out.println(i);

        int j = 5;
        System.out.println(--j);
        System.out.println(j);

        // WTF?
        var x = i++ * --j / i++;

        System.out.println(x);
        System.out.println(i);
        System.out.println(j);
    }

}
