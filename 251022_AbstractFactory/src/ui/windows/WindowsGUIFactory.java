package ui.windows;

import ui.core.Button;
import ui.core.CheckBox;
import ui.core.GUIFactory;
import ui.core.TextField;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}
