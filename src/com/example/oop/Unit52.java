package com.example.oop;

import java.util.ArrayList;
import java.util.Iterator;

public class Unit52 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("blog1");
        al.add("blog12");
        al.add("blog13");
        al.add("blog14");

        Iterator iterator = al.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
