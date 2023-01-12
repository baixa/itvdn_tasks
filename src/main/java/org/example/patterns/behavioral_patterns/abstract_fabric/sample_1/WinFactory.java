package org.example.patterns.behavioral_patterns.abstract_fabric.sample_1;

public class WinFactory implements GUIFactory {
    /**
     * Create win button
     * @return created button
     */
    @Override
    public Button createButton() {
        return new WinButton();
    }

    /**
     * Create win checkbox
     * @return created checkbox
     */
    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
