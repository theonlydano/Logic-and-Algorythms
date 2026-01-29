package ui.windows;

import ui.core.TextField;

public class WindowsTextField implements TextField {

    private String text = "";
    private boolean enabled = true;

    @Override
    public void paint() {

    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
