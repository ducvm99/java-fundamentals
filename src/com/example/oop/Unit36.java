package com.example.oop;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Unit36 extends Demo36 {
    public static void main(String[] args) {

    }

    public int increase(int a) {
        return a + 7;
    }

    public Unit35 create() throws FileNotFoundException {
        return new Unit35();
    }
}

class Demo36 {
    public int increase(int a) {
        return a + 5;
    }

    public Demo35 create() throws IOException {
        return new Demo35();
    }
}