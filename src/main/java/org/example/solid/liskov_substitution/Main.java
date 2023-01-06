package org.example.solid.liskov_substitution;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.doSmth();
        Child c = new Child();
        c.doSmth();
    }
}
