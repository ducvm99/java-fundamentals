package com.example.oop;

public class Unit43 {
    public static void main(String[] args) {
        String myCountry = "United State of America of America";
        System.out.println(myCountry.length());
        System.out.println(myCountry.replace("of", "Hello"));
        System.out.println(myCountry.replaceFirst("of", "Hello"));

        String name = "minh duc";
//        if (name == "minh duc") {
//            System.out.println("True");
//        }

        if (name.equals("minh duc")) {
            System.out.println("True");
        }
    }
}
