package lab;

public class VariableDecorator extends BasedDecorator{

    public VariableDecorator(Component component) {
        super(component);
    }

    @Override
    public String execute(String expression) {
        String response = super.execute(expression);
        if (expression.equals("x") || expression.equals("y") || expression.equals("z")) {
            response += "\nIs variable";
        } else {
            response += "\nNot a variable";
        }
        return response;
    }
}
