public class MilkDecorator extends Decorator {

    public MilkDecorator(Component component) {
        super(component);
    }

    @Override
    public String getDescription() {
        return component.getDescription() + ", Milk";
    }

    @Override
    public int getCost() {
        return component.getCost() + 20;
    }

}