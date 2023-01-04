package org.example.java_professional_renewed.annotations.simple_anno;

import java.lang.annotation.*;

/**
 * Created by Ivan Maksimchuk.
 */
//@MyAnno(value = "World", i = 25)
@MyAnno2("Hello")
@MyAnno2("World")
public class A {
    public void print() {
        System.out.println("A");
        B b = new B();
    }
}

@Deprecated
class B extends A {
    @Deprecated
//    @MyAnno("World")
    private int i;

    @Deprecated
    @Override
    public void print() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A a = new B();
        a.print();
//        A.print();
    }
}

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@interface MyAnno {
    MyAnno2[] value();
    String str() default "Hello";

    int i() default 10 + 10;
    enum MyEnum {
        BLACK, WHITE, GREEN, ORANGE
    }
}

@Repeatable(MyAnno.class)   // Java 8
@interface MyAnno2 {
    String value();
}

@FunctionalInterface
        //  JDK8
interface MyOwnInterf {
    int i();
}