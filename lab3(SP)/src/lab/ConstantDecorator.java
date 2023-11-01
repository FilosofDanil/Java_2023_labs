package lab;

public class ConstantDecorator extends BasedDecorator {
    public ConstantDecorator(Component component) {
        super(component);
    }

    @Override
    public String execute(String expression) {
        String response = super.execute(expression);
        if (parseAble(expression)) {
            response += "\nIs constant";
        } else {
            response += "\nNot a constant";
        }
        return response;
    }

    private boolean parseAble(String expression) {
        try {
            Integer.parseInt(expression);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
