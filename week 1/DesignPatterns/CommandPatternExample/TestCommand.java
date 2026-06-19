public class TestCommand {

    public static void main(String[] args) {

        Light light = new Light();

        Command lightOn =
                new LightOnCommand(light);

        RemoteControl remote =
                new RemoteControl();

        remote.setCommand(lightOn);

        remote.pressButton();

    }

}