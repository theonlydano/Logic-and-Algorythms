package ui.windows;

import ui.core.Button;

public class WindowsButton implements Button {

    private String label = "Windows Button";
    private boolean enabled = true;

    @Override
    public void setLabel(String label) {
        this.label = label;
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
