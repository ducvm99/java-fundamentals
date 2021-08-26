package com.example.oop;

public class Unit35 extends Demo35 {
    public static void main(String[] args) {
        Unit35 unit35 = new Unit35();

        unit35.show();
    }

    public void show() {
        System.out.println("Show demo 2");
    }
}

class Demo35 {
    protected void show() {
        System.out.println("Show demo 1");
    }
}