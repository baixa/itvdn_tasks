package org.example.patterns.behavioral_patterns.factory_method.sample_2;

public class ConcreteCreator extends Creator {
    /**
     * Factory method, that creates and returns new product
     *
     * @return created product
     */
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
