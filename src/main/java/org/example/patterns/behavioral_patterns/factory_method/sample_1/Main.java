package org.example.patterns.behavioral_patterns.factory_method.sample_1;

public class Main {
    public static void main(String[] args) {
        Dialog webDialog = new WebDialog();
        Dialog windowsDialog = new WindowsDialog();

        webDialog.render();
        windowsDialog.render();

    }
}
