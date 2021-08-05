package com.company;

import java.util.Scanner;

public class EnumDemo {
    enum TrafficLight {
        RED {
            @Override
            public void printMessage() {
                System.out.println("STEADY!");
            }
        },
        YELLOW {
            @Override
            public void printMessage() {
                System.out.println("READY!");
            }
        },
        GREEN {
            @Override
            public void printMessage() {
                System.out.println("GO!");
            }
        };
        public abstract void printMessage();
    }

    public static void showLight(TrafficLight color) {
        switch (color) {
            case RED:
                System.out.println("Current color: red");
                break;
            case YELLOW:
                System.out.println("Current color: yellow");
                break;
            case GREEN:
                System.out.println("Current color: green");
                break;
            default:
                throw new IllegalArgumentException("color not supported " + color);
        }
    }

    public static void main(String[] args) {
        showLight(TrafficLight.RED);
        showLight(TrafficLight.YELLOW);
        showLight(TrafficLight.GREEN);

        System.out.println("--------");

        for (var tl : TrafficLight.values()) {
            tl.printMessage();
        }

        System.out.println("--------------");
//        System.out.println("What traffic light to show?");
//        var scanner = new Scanner(System.in);
//        var colorName = scanner.next();
//        var tl = TrafficLight.valueOf(colorName);
//        showLight(tl);
    }
}
