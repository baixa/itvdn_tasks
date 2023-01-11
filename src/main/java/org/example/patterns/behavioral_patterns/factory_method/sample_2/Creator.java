package org.example.patterns.behavioral_patterns.factory_method.sample_2;

public abstract class Creator {
    private Product product;

    public abstract Product factoryMethod();

    public void operate() {
        product = factoryMethod();
    }
}
