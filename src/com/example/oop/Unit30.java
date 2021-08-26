package com.example.oop;

public class Unit30 {
    public static void main(String[] args) {
        String test = "Hello world";

        try {
            System.out.println("Before");
            // 50 -> Error
            // System.out.println(test.substring(50));
            System.out.println(test.substring(10));
            int a = 5;
            int b = 0;
            System.out.println("a/b: " + a/b);
            System.out.println("After 1");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.toString());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        } finally {
            System.out.println("Always done");
        }
        System.out.println("After 2");
    }
}
