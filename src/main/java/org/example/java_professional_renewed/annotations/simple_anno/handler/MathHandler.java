package org.example.java_professional_renewed.annotations.simple_anno.handler;

import org.example.java_professional_renewed.annotations.simple_anno.annotation.MathAnno;

/**
 * Created by Ivan Maksimchuk.
 */
public class MathHandler {
    @MathAnno(num1 = 10, num2 = 20)
    public void addTwoNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
