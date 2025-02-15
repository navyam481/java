package com.wipro.java.designpattern;

import com.wipro.java.buttons.*;
import com.wipro.java.checkbox.*;
import com.wipro.java.factories.*;

public class Application 
{
	private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
