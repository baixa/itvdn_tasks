package org.example.solid.open_closed.shape_ocp_solution;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(12.7, 15.3);
        Circle circle1 = new Circle(5.7);
        Rectangle rectangle1 = new Rectangle(15, 9);

        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println(areaCalculator.areaCalc(circle, circle1, rectangle, rectangle1));
    }
}
