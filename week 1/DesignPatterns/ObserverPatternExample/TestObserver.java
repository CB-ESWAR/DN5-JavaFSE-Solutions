public class TestObserver {

    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        subject.addObserver(mobile);
        subject.addObserver(web);

        subject.notifyObservers("New Product Launched!");

    }

}