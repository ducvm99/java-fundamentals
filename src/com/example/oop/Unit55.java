package com.example.oop;

public class Unit55 {
    public static void main(String[] args) {
        Thread55 thread55 = new Thread55();
        Thread thread1 = new Thread(thread55);
        Thread thread2 = new Thread(thread55);

        thread1.setName("demo1");
        thread2.setName("demo2");

        thread1.start();
        thread2.start();
    }
}

class Thread55 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 50; i++) {
                Thread.sleep(1);
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        } catch (Exception e) {

        }
    }
}