package com.example.oop;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Unit47 {
    public static void main(String[] args) {
        File file = new File("blog.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            int i = 0;
            while ((line = br.readLine()) != null) {
                // Do something here
                System.out.println(++i + ": " + line);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            Logger.getLogger(Unit47.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
