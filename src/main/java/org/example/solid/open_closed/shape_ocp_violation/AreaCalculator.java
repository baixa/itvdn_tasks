package org.example.solid.open_closed.shape_ocp_violation;

import java.util.Arrays;
import java.util.function.Consumer;

public class AreaCalculator {
//    public double areaCalc(Rectangle... rectangles) {
//        return Arrays.stream(rectangles)
//                .mapToDouble(rectangle -> rectangle.getWidth() * rectangle.getHeight())
//                .sum();
//    }

    public double areaCalc(Object... shapes) {
        double area = 0;
        for (Object shape :
                shapes) {
            if (shape instanceof Rectangle rectangle) {
                area += rectangle.getWidth() * rectangle.getHeight();
            } else if (shape instanceof Circle circle) {
                area += Math.PI * Math.pow(circle.getRadius(), 2);
            }
        }
        return area;
    }
}
