package org.example.java_professional_renewed.io;

import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        float f = scanner.nextFloat();
        String s1 = scanner.next();
        String s2 = scanner.nextLine();

        System.out.printf("1 = %d, 2 = %f2, 3 = %s, 4 = %s", i, f, s1, s2);
    }
}
