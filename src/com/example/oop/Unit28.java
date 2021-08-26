package com.example.oop;

public class Unit28 extends Unit {
    final float PI = 3.14f;
    int number;

    public static void main(String[] args) {
        Unit28 test = new Unit28();
        test.number = 10;
        // Error
        // test.PI = 10;
    }

    public void change() {
        number = 20;
        // PI = 30;
    }

//    void show() {
//
//    }
}

// Error
// final class Unit {
class Unit {
    final void show() {

    }
}
