package ui.mac;

import ui.core.Button;

public class MacOSButton implements Button {

    private String label = "macOS Button";
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
