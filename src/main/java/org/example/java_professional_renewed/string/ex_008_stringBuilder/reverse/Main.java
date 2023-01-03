package org.example.java_professional_renewed.string.ex_008_stringBuilder.reverse;

public class Main {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse();  // reverse it
        System.out.println(sb);
    }
}
