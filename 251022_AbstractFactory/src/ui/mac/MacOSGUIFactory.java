package ui.mac;

import ui.core.Button;
import ui.core.CheckBox;
import ui.core.GUIFactory;
import ui.core.TextField;

public class MacOSGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }

    @Override
    public TextField createTextField() {
        return new MacOSTextField();
    }
}
