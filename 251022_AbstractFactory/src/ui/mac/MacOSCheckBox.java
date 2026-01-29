package ui.mac;

import ui.core.CheckBox;

public class MacOSCheckBox implements CheckBox {

    private boolean checked = true;
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
