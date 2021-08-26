package com.example.oop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Unit46 {
    public static void main(String[] args) {
        try {
            File file = new File("blog.txt");
            file.createNewFile();

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            // Do something here
            String data = "Demo vu minh duc";
            bw.write(data + "\n");
            bw.write(data);
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
