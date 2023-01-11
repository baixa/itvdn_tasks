package org.example.patterns.behavioral_patterns.factory_method.sample_1;

public class WebDialog extends Dialog {
    /**
     * Create and return web-button
     *
     * @return created button
     */
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
