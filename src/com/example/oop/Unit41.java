package com.example.oop;

public class Unit41 {
    public static void main(String[] args) {
        BookCase bc = new BookCase();
        bc.setColor("Red");
        System.out.println(bc.getColor());
        bc.setColor("Yellow");
        System.out.println(bc.getColor());
    }
}

class BookCase {
    private int size;
    private String color;
    private boolean good;

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public boolean isGood() {
        return good;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGood(boolean good) {
        this.good = good;
    }
}
