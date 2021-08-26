package com.example.oop;

public class Unit23 {

}

class Outer {
    public void show() {
        Inner in = new Inner();
        in.display();
    }

    class Inner {
        public void display() {
            System.out.println("I am an inner class");
        }
    }
}

class C {
    public void show() {
        Outer.Inner in = new Outer().new Inner();
        in.display();
    }

}