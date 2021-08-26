package com.example.oop;

public class Unit25 {
    public static void main(String[] args) {
        Boss b1 = new Boss();
        System.out.println(b1.name);
        System.out.println(b1.address);
        // Error when using the privates attribute
        // System.out.println(b1.numberOfWives);

        b1.showWives();
        b1.showName();
        b1.showAddress();
        // Error here
        // b1.showAge();
    }
}

class Boss {
    // Every where
    public int age;
    // Same package, its subclass
    protected String name;
    // Same package
    String address;
    // Only for it
    private int numberOfWives;

    private void showAge() {
        System.out.println(age);
    }

    public void showName() {
        System.out.println(name);
    }

    protected void showAddress() {
        System.out.println(address);
    }

    public void showWives() {
        System.out.println(numberOfWives);
    }
}