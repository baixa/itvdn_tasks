package org.example.java_professional_renewed.lambdas.ex_001_lambdaExpression.lambdaExpression;

public class Radio implements ElectricityConsumer {

    private void playMusic() {
        System.out.println("Radio plays");
    }

    public void electricityOn(Object sender) {
        playMusic();
    }
}
