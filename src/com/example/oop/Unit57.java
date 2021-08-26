package com.example.oop;

public class Unit57 {
    {
        System.out.println("Block code 1");
    }

    static {
        System.out.println("static Block code 1");
    }

    public Unit57() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Unit57 unit57 = new Unit57();
    }

    {
        System.out.println("Block code 2");
    }

    static {
        System.out.println("static Block code 2");
    }
}
