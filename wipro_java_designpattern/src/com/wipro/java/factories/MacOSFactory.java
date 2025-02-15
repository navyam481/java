package com.wipro.java.factories;


import com.wipro.java.buttons.*;
import com.wipro.java.checkbox.*;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckbox();
    }
}
