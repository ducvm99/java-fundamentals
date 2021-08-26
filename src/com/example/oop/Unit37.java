package com.example.oop;

public class Unit37 {
    enum COLOR {RED, BLUE, GREEN};

    public static void main(String[] args) {
        System.out.println(COLOR.BLUE);

        COLOR c = COLOR.RED;
        System.out.println(c);
        System.out.println(c.GREEN);

        if (c == COLOR.RED) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        switch (c) {
            case RED:
                System.out.println("RED 1");
                break;
            case BLUE:
                System.out.println("BLUE 1");
                break;
            case GREEN:
                System.out.println("GREEN 1");
                break;
        }
    }
}
