package com.example.basic;

public class Student {
    private String name = "Minh Duc";
    private int age = 22;

    public void showStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.showStudent();
        System.out.println("Sum of two numbers: " + st.addNumbers(4, 6));
    }
}