package com.example.oop;

public class Unit33 {
    public static void main(String[] args) {
        Unit33 unit33 = new Unit33();

        // Overload
        System.out.println(unit33.add(3.5f, 5.4f));
    }

    public int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }
}
