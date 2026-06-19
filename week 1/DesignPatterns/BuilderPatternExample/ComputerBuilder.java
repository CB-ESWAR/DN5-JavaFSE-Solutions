public class ComputerBuilder {

    private String processor;
    private int ram;
    private int storage;
    private boolean graphicsCard;
    private boolean bluetooth;

    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setGraphicsCard(boolean graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public ComputerBuilder setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }

    public Computer build() {
        return new Computer(
                processor,
                ram,
                storage,
                graphicsCard,
                bluetooth
        );
    }
}