package com.wipro.java.factories;

import com.wipro.java.buttons.*;
import com.wipro.java.checkbox.*;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckbox();
    }
}
