package org.example.java_professional_renewed.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleBufferedReader {
    public static void main(String[] args) throws IOException {
//        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
//            int num = Integer.parseInt(bufferedReader.readLine());
//            System.out.println("Input: " + str);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        //System.in -> bytes
//        int i = System.in.read();
//        System.out.println(i);
//        System.out.println((char) i);
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        int i2 = inputStreamReader.read();
        System.out.println(i2);
        System.out.println((char) i2);
    }
}
