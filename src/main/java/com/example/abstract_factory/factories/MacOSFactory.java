package com.example.abstract_factory.factories;

import com.example.abstract_factory.button.Button;
import com.example.abstract_factory.button.MacOSButton;
import com.example.abstract_factory.checkbox.Checkbox;
import com.example.abstract_factory.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
