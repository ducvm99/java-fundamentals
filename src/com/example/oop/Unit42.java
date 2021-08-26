package com.example.oop;

public class Unit42 {
    public static void main(String[] args) {
        String blog = "Demo minh duc haha";
        System.out.println(blog);
        System.out.println(blog.charAt(6));
        System.out.println(blog.indexOf("minh"));
        System.out.println(blog.substring(5));
        System.out.println(blog.substring(5, 10));

        String name = " duc is handsome ";
        System.out.println(name);
        System.out.println(name.trim());

        String [] arr = name.trim().split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
