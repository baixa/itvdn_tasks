package org.example.java_professional_renewed.lambdas.ex_001_lambdaExpression.withoutLambdaExpression;

public class Lamp implements ElectricityConsumer {

    private void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
