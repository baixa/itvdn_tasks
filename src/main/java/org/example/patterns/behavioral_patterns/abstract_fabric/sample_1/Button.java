package org.example.patterns.behavioral_patterns.abstract_fabric.sample_1;

/**
 * Этот паттерн предполагает, что у вас есть несколько семейств
 * продуктов, находящихся в отдельных иерархиях классов
 * (Button/Checkbox). Продукты одного семейства должны иметь
 * общий интерфейс.
 */
public interface Button {
    void paint();
}
