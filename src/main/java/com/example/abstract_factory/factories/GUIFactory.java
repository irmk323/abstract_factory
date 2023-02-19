package com.example.abstract_factory.factories;

import com.example.abstract_factory.button.Button;
import com.example.abstract_factory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}