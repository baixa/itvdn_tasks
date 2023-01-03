package org.example.java_professional_renewed.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    private static final Pattern LOGIN_PATTERN = Pattern.compile("^[A-Za-z]{7,}$");
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^[\\dA-Za-z]{8,}$");

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            boolean isLoginCorrect = false;
            boolean isPasswordCorrect = false;
            System.out.println("������� �����:");
            while (!isLoginCorrect) {
                String input = reader.readLine();
                Matcher matcher = LOGIN_PATTERN.matcher(input);
                if (matcher.matches()) {
                    isLoginCorrect = true;
                }
                else {
                    System.out.println("����� ��������! ��������� �������:");
                }
            }
            System.out.println("������� ������:");
            while (!isPasswordCorrect) {
                String input = reader.readLine();
                Matcher matcher = PASSWORD_PATTERN.matcher(input);
                if (matcher.matches()) {
                    isPasswordCorrect = true;
                }
                else {
                    System.out.println("������ ��������! ��������� �������:");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
