package com.example.abstract_factory.app;

import com.example.abstract_factory.button.Button;
import com.example.abstract_factory.checkbox.Checkbox;
import com.example.abstract_factory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
