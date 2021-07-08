package com.company;

public class TimeDemo {
    public static void main(String[] args) {
        var t1 = System.currentTimeMillis();
        System.out.println(t1);
        System.out.printf("%1$tb %1$te, %1$tY %1$tH:%1$tM\n", t1);
    }
}
