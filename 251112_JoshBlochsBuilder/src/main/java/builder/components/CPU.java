package builder.components;

public class CPU {
    private String model;
    private int cores;
    private double clockGHz;

    public CPU(String model, int cores, double clockGHz) {
        this.model = model;
        this.cores = cores;
        this.clockGHz = clockGHz;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Cores: " + cores + ", Clock GHz: " + clockGHz;
    }
}
