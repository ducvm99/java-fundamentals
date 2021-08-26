package com.example.oop;

import java.util.Vector;

public class Unit51 {
    public static void main(String[] args) {
        Vector<C1> vector = new Vector<C1>();
        vector.add(new C1());
        vector.add(new C1());
        vector.add(new D());

        Vector<D> vector1 = new Vector<D>();
        vector1.add(new D());
        // vector1.add(new C());
    }
}

class C1 {

}

class D extends C1 {

}
