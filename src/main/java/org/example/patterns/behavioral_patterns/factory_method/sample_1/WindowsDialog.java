package org.example.patterns.behavioral_patterns.factory_method.sample_1;

public class WindowsDialog extends Dialog {
    /**
     * Create and return windows button
     *
     * @return created button
     */
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
