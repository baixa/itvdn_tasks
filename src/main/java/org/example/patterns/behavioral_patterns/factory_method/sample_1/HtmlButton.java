package org.example.patterns.behavioral_patterns.factory_method.sample_1;

public class HtmlButton implements org.example.patterns.behavioral_patterns.factory_method.sample_1.Button {
    /**
     * Render web-button
     */
    @Override
    public void render() {
        System.out.println("Show web-button!");
    }

    /**
     * Action "on click" of button
     */
    @Override
    public void onClick() {
        System.out.println("Click web-button!");
    }
}
