package ui.windows;

import ui.core.CheckBox;

public class WindowsCheckBox implements CheckBox {

    private boolean checked = false;
    private boolean enabled = true;

    @Override
    public boolean isChecked() {
        return checked;
    }

    @Override
    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public void paint() {

    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public void handleClick() {

    }
}
