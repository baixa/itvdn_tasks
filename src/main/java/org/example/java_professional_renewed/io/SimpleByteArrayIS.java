package org.example.java_professional_renewed.io;

import java.io.ByteArrayInputStream;

public class SimpleByteArrayIS {
    public static void main(String[] args) {
        byte[] arr = new byte[] {1, 3, 7, 5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);

        int temp;
        while((temp = byteArrayInputStream.read()) != -1) {
            System.out.println(temp);
        }

        String str = "Hello";
        byte[] arr2 = str.getBytes();
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr2, 1, 2);

        int temp1;
        while((temp1 = byteArrayInputStream1.read()) != -1) {
            System.out.println((char) temp1);
        }

    }
}
