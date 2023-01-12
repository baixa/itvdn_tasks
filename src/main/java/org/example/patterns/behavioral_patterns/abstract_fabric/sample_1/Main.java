package org.example.patterns.behavioral_patterns.abstract_fabric.sample_1;

public class Main {

    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;

    public Main(GUIFactory factory) {
        this.factory = factory;
    }

    public static void main(String[] args) {
        Main macFactory = new Main(new MacFactory());
        macFactory.createUI();
        macFactory.paint();

        Main winFactory = new Main(new WinFactory());
        winFactory.createUI();
        winFactory.paint();
    }

    private void paint() {
        button.paint();
        checkbox.paint();
    }

    private void createUI() {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
}
