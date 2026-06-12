public class SugarDecorator extends Decorator {

    public SugarDecorator(Component component) {
        super(component);
    }

    @Override
    public String getDescription() {
        return component.getDescription() + ", Sugar";
    }

    @Override
    public int getCost() {
        return component.getCost() + 10;
    }

}