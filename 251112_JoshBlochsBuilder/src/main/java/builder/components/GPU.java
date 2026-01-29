package builder.components;

public class GPU {
    private String model;

    public GPU(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Model" + model;
    }
}
