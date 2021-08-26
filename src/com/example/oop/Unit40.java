package com.example.oop;

public class Unit40 {
    public static void main(String[] args) {
        System.out.println(new Sup40());
    }
}

class Super40 {
//    public Super40() {
//        System.out.println("Super");
//    }

    public Super40(int a) {
    }
}

class Sup40 extends Super40 {
    public Sup40() {
        // super();
        super(3);
    }

    public Sup40(int a) {
        // super();
        super(a);
    }
}