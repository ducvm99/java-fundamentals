package com.example.oop;

public class Unit34 extends Demo{
    public static void main(String[] args) {
        Unit34 unit34 = new Unit34();

        // Overload
        System.out.println(unit34.add(3.5f, 5.4f));


        System.out.println(unit34.add("Minh ", "Duc"));
    }

    public int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }
}

class Demo {
    public String add(String str1, String str2) {
        return str1 + str2;
    }
}