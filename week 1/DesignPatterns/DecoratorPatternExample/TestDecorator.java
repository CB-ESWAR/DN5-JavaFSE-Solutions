public class TestDecorator {

    public static void main(String[] args) {

        Component coffee = new Coffee();

        coffee = new MilkDecorator(coffee);

        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription());

        System.out.println("Cost: ₹" + coffee.getCost());

    }

}