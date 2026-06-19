public class TestAdapter {

    public static void main(String[] args) {

        PayPalGateway payPalGateway = new PayPalGateway();

        PaymentProcessor paymentProcessor =
                new PayPalAdapter(payPalGateway);

        paymentProcessor.processPayment();
    }
}