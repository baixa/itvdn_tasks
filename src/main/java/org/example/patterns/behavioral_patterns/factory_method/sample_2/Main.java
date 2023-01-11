package org.example.patterns.behavioral_patterns.factory_method.sample_2;

public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();

        creator.operate();
    }
}
