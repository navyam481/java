package com.wipro.java.factories;

import com.wipro.java.buttons.*;
import com.wipro.java.checkbox.*;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}