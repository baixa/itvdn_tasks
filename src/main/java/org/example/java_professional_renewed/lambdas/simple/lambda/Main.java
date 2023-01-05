package org.example.java_professional_renewed.lambdas.simple.lambda;

/**
 * Created by Ivan Maksimchuk.
 */
public class Main {
    static int i = 20;
    public static void main(String[] args) {
        int i = 30;
        User user1 = System.out::println;
    }
}

@FunctionalInterface
interface User {
    void print(int i);
}

