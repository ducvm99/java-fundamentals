package com.example.oop;

public class Unit32 {
    public static void main(String[] args) {
        Building b = new Building();
        try {
            b.go();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyException extends Exception {
    // Do something
}

class Building {
    public void show() throws MyException {
        int numberOfConnection = 0;
        // Do something

        if (numberOfConnection > 100) {
            throw new MyException();
        }
    }

    public void go() throws InterruptedException {
        Thread.sleep(1000);
    }
}