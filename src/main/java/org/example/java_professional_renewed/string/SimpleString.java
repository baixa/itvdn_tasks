package org.example.java_professional_renewed.string;

/**
 * Created by Ivan Maksimchuk.
 */
public class SimpleString {
    public static void main(String[] args) {
        String str = "Hello";  // literal
        String str2 = new String("Hello"); // new

        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(arr, 0, 2);

        System.out.println(str3);
    }
}
