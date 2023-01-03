package org.example.java_professional_renewed.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SimpleErr {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("D:")) {
            System.out.println("File was opened");
        } catch (IOException e) {
            System.out.println("File wasn't opened");
            System.err.println(" ");
            e.printStackTrace();
        }
    }
}
