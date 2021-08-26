package com.example.oop;

import java.util.HashMap;

public class Unit49 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("blog", "Minh duc");
        map.put("blog1", "Minh duc 1");
        map.put("blog2", "Minh duc 2");
        System.out.println(map.get("blog"));
        System.out.println(map.get("blog2"));
        System.out.println(map.size());
        map.remove("blog2");
        System.out.println(map.get("blog2"));
        map.clear();
        System.out.println(map.get("blog"));
    }
}
