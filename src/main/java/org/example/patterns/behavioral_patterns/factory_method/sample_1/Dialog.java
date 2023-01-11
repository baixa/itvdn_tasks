package org.example.patterns.behavioral_patterns.factory_method.sample_1;

/**
 * Паттерн Фабричный метод применим тогда, когда в программе есть иерархия классов продуктов
 *
 * Базовый класс фабрики
 */
public abstract class Dialog {

    /**
     * Render dialog window
     */
    public void render() {
        System.out.println("Show dialog!");
        Button button = createButton();
        button.onClick();
        button.render();
    }

    /**
     * Create and return new button
     *
     * @return created button
     */
    public abstract Button createButton();
}
