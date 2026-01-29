package builder.product;

import builder.components.CPU;
import builder.components.GPU;
import builder.components.Memory;
import builder.components.Storage;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private Storage storage;
    private GPU gpu;
    private String operatingSystem;
    private boolean hasWiFi;

    private Computer(Builder builder) {

    }

    @Override
    public String toString() {
        return "CPU: " + cpu + ", memory: " + memory + ", storage: " + storage + ", gpu: " + gpu + ", operatingSystem: " + operatingSystem + ", hasWiFi: " + hasWiFi;
    }

    public static class Builder {
        private Builder() {}

        public void setCPU(CPU cpu) {
            this.cpu = cpu;
        }
    }
}
