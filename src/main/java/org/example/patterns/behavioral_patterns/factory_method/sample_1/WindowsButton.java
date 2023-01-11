package org.example.patterns.behavioral_patterns.factory_method.sample_1;

public class WindowsButton implements org.example.patterns.behavioral_patterns.factory_method.sample_1.Button {
    /**
     * Render Windows Button
     */
    @Override
    public void render() {
        System.out.println("Show windows button!");
    }

    /**
     * Action "on click" of button
     */
    @Override
    public void onClick() {
        System.out.println("Click windows button!");
    }
}
