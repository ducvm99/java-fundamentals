package com.example.oop;

import java.util.ArrayList;
import java.util.Vector;

public class Unit48 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Demo 1");
        al.add(new String("Demo 2"));
        System.out.println(al.get(0));
        Object [] array = al.toArray();
        System.out.println(array.length + " " + al.size());
        for (Object o : al) {
            System.out.println(o);
        }

        Vector vector = new Vector();
        vector.add("Blog by Minh Duc");
    }
}
