package com.example.oop;

public class Unit38 {
    enum COLOR {
        RED(5), BLUE(6), GREEN(7);
        private int value;
        COLOR(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    };

    public static void main(String[] args) {
        COLOR c = COLOR.BLUE;
        System.out.println(c + ": " + c.getValue());
    }
}
