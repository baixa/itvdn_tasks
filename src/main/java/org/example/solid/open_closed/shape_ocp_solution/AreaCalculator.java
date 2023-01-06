package org.example.solid.open_closed.shape_ocp_solution;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class AreaCalculator {
    public double areaCalc(@NotNull Shape... shape) {
        return Arrays.stream(shape)
                .mapToDouble(Shape::area)
                .sum();
    }
}
