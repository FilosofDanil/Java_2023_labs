package lab;

public class BasedDecorator implements Component {
    private Component component;

    public BasedDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String execute(String expression) {
        return component.execute(expression);
    }
}
