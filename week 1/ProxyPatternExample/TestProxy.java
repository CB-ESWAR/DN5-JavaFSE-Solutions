public class TestProxy {

    public static void main(String[] args) {

        Image image = new ProxyImage("photo.jpg");

        System.out.println("Image created");

        image.display();

        image.display();

    }

}