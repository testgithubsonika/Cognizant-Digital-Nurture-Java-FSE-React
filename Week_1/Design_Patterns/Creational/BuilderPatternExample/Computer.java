package Week_1.Design_Patterns.Creational.BuilderPatternExample;

public class Computer {

    private String cpu;
    private int ram;
    private int storage;
    private String gpu;

    // Private constructor
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
    }

    public void displayConfig() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU     : " + cpu);
        System.out.println("RAM     : " + ram + " GB");
        System.out.println("Storage : " + storage + " GB");
        System.out.println("GPU     : " + gpu);
        System.out.println();
    }

    // Static Nested Builder Class
    public static class Builder {

        private String cpu;
        private int ram;
        private int storage;
        private String gpu;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
