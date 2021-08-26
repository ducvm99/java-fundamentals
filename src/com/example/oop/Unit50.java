package com.example.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class Unit50 {
    public static void main(String[] args) {
        ArrayList<A> al = new ArrayList<A>();
        al.add(new A());
        for (A a : al) {
            a.show();
        }

        HashMap<String, B> map = new HashMap<String, B>();
        map.put("blog", new B());
        // map.put("blog1", new A());
    }
}

class A {
    public void show() {

    }
}

class B {
    public void go() {

    }
}