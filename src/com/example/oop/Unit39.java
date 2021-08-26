package com.example.oop;

public class Unit39 {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1.getSize());
        System.out.println(b1.getColor());

        Box b2 = new Box(15, "Yellow");
        System.out.println(b2.getSize());
        System.out.println(b2.getColor());
    }
}

class Box {
    private int size;
    private String color;

    public Box() {
        size = 10;
        color = "red";
        // Get other methods
        System.out.println("Study");
    }

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
