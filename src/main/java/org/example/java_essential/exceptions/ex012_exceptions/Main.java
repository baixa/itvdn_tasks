package org.example.java_essential.exceptions.ex012_exceptions;

/**
 * Обработка исключений.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw null;
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
