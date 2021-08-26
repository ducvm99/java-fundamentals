package com.example.oop;

public class Unit26 {
    public static void main(String[] args) {
        ReferentBook book = new ReferentBook();
        book.move();
    }
}

interface Document {
    void show();
}

interface ReferentDoc extends Document {
    @Override
    void show();
}

class Book implements Document {

    @Override
    public void show() {

    }

    public void move() {

    }
}

class Paper implements Document {

    @Override
    public void show() {

    }
}

class ReferentBook extends Book implements Document, ReferentDoc {

}