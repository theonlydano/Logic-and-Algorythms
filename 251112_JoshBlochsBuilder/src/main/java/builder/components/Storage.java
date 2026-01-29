package builder.components;

public class Storage {
    private int sizeGB;
    private String type;

    public Storage(int sizeGB, String type) {
        this.sizeGB = sizeGB;
        this.type = type;
    }

    @Override
    public String toString() {
        return "sizeGB: " + sizeGB + ", type: " + type;
    }
}
