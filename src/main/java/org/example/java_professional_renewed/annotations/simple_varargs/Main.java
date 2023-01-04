package org.example.java_professional_renewed.annotations.simple_varargs;

/**
 * Created by Ivan Maksimchuk.
 */
public class Main {
    private int calcSum(int... values) {
        int result = 0;
        for (int tmp : values) {
            result += tmp;
        }
        return result;
    }

    public static void main(String... args) {
        Main m = new Main();
        System.out.println(m.calcSum(2, 3));
        System.out.println(m.calcSum(2));
        System.out.println(m.calcSum(125));
    }
}
