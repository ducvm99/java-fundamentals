package com.example.oop;

public class Unit24 {
    public static void main(String[] args) {
        Manager man = new Manager();
        man.show();
    }
}

interface Human {
    public static final int AVG_AGE = 100;
    int AVG_WEIGHT = 100;

    public abstract void show();
    void study();
}

class Manager implements Human {
    @Override
    public void show() {
        System.out.println("AVG_AGE: " + Human.AVG_AGE);
    }

    @Override
    public void study() {

    }
}