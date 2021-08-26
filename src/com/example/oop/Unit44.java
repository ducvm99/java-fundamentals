package com.example.oop;

public class Unit44 {
    public static void main(String[] args) {
        String test = "TEST";
        test.substring(0);
        System.out.println(test.substring(0));

        StringBuilder builder = new StringBuilder("Demo 1");
        StringBuffer buffer = new StringBuffer("Demo 2");

        builder.append(" Minh duc");
        System.out.println(builder);
        builder.delete(2, 4);
        builder.deleteCharAt(2);
        System.out.println(builder);
    }
}
