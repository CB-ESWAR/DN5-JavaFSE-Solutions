public class TestBuilder {

    public static void main(String[] args) {

        Computer computer = new ComputerBuilder()
                .setProcessor("Intel i7")
                .setRam(16)
                .setStorage(512)
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();

        System.out.println(computer);
    }
}