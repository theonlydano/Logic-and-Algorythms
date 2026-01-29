package application;

import ui.core.Button;
import ui.core.CheckBox;
import ui.core.GUIFactory;
import ui.core.TextField;

public class Application {
    private Button button;
    private CheckBox checkBox;
    private TextField textField;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
        this.textField = factory.createTextField();
    }

    public void run(){

    }
}
