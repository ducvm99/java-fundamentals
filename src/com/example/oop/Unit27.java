package com.example.oop;

public class Unit27 {
    public static void main(String[] args) {
        Room r1 = new Room();
        r1.number = 10;
        System.out.println("r1 number: " + r1.number);
        System.out.println("r1 area before: " + r1.area);
        r1.area = 300;
        System.out.println("r1 area after: " + r1.area);

        Room r2 = new Room();
        r2.number = 20;
        System.out.println("r2 number: " + r2.number);
        Room.area = 400;
        System.out.println("r2 area: " + r2.area);

        Room r3 = new Room();
        r3.number = 30;
        System.out.println("r3 number: " + r3.number);
        System.out.println("r3 area: " + r3.area);
        Room.show();
    }
}

class Room {
    static int area = 200;
    int number;

    public static void show() {
        System.out.println("show: ");
        area = 500;
        // Error not static property
        // number = 0;
    }
}