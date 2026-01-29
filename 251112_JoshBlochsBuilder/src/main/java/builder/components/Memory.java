package builder.components;

public class Memory {
    private int sizeGB;
    private String type;

    public Memory(int sizeGB, String type) {
        this.sizeGB = sizeGB;
        this.type = type;
    }

    @Override
    public String toString() {
        return "sizeGB: " + sizeGB + ", type: " + type;
    }
}
