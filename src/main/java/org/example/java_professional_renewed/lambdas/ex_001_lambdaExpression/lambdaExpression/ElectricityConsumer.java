package org.example.java_professional_renewed.lambdas.ex_001_lambdaExpression.lambdaExpression;

// Функциональный интерфейс( с 1 методом )
// Аннотация контролиует, что интерфейс является функциональным
@FunctionalInterface
public interface ElectricityConsumer {

    void electricityOn(Object sender);
}
