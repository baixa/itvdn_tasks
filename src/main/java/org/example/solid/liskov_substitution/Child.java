package org.example.solid.liskov_substitution;

public class Child extends Parent{
    @Override
    public void doSmth() {
        throw new RuntimeException();
    }
}
