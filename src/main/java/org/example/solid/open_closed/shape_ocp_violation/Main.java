package org.example.solid.open_closed.shape_ocp_violation;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10.5);
        Rectangle rectangle1 = new Rectangle(56, 12.7);

        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println(areaCalculator.areaCalc(rectangle, rectangle1));
    }
}
