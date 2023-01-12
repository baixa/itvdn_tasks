package org.example.patterns.behavioral_patterns.abstract_fabric.sample_1;

public class MacFactory implements GUIFactory {
    /**
     * Create mac button
     * @return created button
     */
    @Override
    public Button createButton() {
        return new MacButton();
    }

    /**
     * Create mac checkbox
     * @return created checkbox
     */
    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
