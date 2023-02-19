package com.example.abstract_factory.factories;

import com.example.abstract_factory.button.Button;
import com.example.abstract_factory.button.WindowsButton;
import com.example.abstract_factory.checkbox.Checkbox;
import com.example.abstract_factory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
