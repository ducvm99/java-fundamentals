package com.example.oop;

import java.io.File;
import java.io.IOException;

public class Unit45 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            file.createNewFile();
            File directory = new File("new");
            directory.mkdirs();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
