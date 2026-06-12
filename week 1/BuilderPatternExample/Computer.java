public class Computer {

    private String processor;
    private int ram;
    private int storage;
    private boolean graphicsCard;
    private boolean bluetooth;

    public Computer(String processor,
                    int ram,
                    int storage,
                    boolean graphicsCard,
                    boolean bluetooth) {

        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "Processor: " + processor +
               "\nRAM: " + ram + " GB" +
               "\nStorage: " + storage + " GB" +
               "\nGraphics Card: " + graphicsCard +
               "\nBluetooth: " + bluetooth;
    }
}