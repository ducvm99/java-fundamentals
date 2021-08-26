package com.example.oop;

public class Unit54 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                try {
                    System.out.println("Pause");
                    Thread.sleep(3000);
                    System.out.println("Restart");
                } catch (InterruptedException e) {

                }
            }
        };
        thread.run();
        thread.start();

        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Pause " + i);
                Thread.sleep(500);
                System.out.println("Restart " + i);
            } catch (InterruptedException e) {

            }
        }
    }
}

class YourThread implements Runnable {
    @Override
    public void run() {

    }
}