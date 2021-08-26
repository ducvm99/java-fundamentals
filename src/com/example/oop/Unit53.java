package com.example.oop;

public class Unit53 {
    public static void main(String[] args) {
        Unit53 unit53 = new Unit53();
        System.out.println(unit53);
        System.out.println(unit53.toString());
        Unit52 unit52 = new Unit52();
        StringBuilder sb = new StringBuilder("Demo 53");
        System.out.println(sb.toString());
    }

    public String toString() {
        return "This is an unit53 object";
    }
}
