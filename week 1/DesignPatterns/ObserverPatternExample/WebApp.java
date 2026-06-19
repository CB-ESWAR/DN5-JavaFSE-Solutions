public class WebApp implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Web App Notification: " + message);
    }

}