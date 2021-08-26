package com.example.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Unit31 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
            File file = new File("test.txt");
            file.createNewFile();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (Exception e) {
            // Write log
            // Show dialog
            // Print cmd
        }
    }
}
