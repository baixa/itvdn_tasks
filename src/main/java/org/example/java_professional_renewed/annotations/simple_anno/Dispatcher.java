package org.example.java_professional_renewed.annotations.simple_anno;


import org.example.java_professional_renewed.annotations.simple_anno.annotation.MathAnno;
import org.example.java_professional_renewed.annotations.simple_anno.handler.MathHandler;

import java.lang.reflect.Method;

/**
 * Created by Ivan Maksimchuk.
 */
public class Dispatcher {
    public static void main(String[] args) {
        MathHandler mathHandler = new MathHandler();
        Class<?> cl = MathHandler.class;
        try {
            Method m = cl.getDeclaredMethod("addTwoNumbers", int.class, int.class);
            MathAnno mathAnno = m.getAnnotation(MathAnno.class);
            mathHandler.addTwoNumbers(mathAnno.num1(), mathAnno.num2());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
