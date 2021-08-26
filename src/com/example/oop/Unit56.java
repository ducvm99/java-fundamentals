package com.example.oop;

public class Unit56 {
    public static void main(String[] args) {
        Thread56 thread56 = new Thread56();
        Thread thread1 = new Thread(thread56);
        Thread thread2 = new Thread(thread56);

        thread1.setName("demo1");
        thread2.setName("demo2");

        thread1.start();
        thread2.start();
    }
}

class Thread56 implements Runnable {
    public int money = 1000;

    @Override
    public synchronized void run() {
        try {
            for (int i = 0; i < 50; i++) {
                Thread.sleep(1);
                System.out.println(Thread.currentThread().getName() + " " + i + " " + money--);
            }
        } catch (Exception e) {

        }
    }
}