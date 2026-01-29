package ui.core;

import ui.mac.MacOSCheckBox;

public interface GUIFactory {
    public Button createButton();
    public MacOSCheckBox createCheckBox();
    public TextField createTextField();
}
