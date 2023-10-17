package lab;

public class ExpressionDecorator extends BasedDecorator {
    public ExpressionDecorator(Component component) {
        super(component);
    }

    @Override
    public String execute(String expression) {
        String response = super.execute(expression);
        if (response.contains("Is constant")) {
            return response + "\nIs simple expression";
        } else if (response.contains("Is variable ")) {
            return response + "\nIs simple expression";
        } else if (response.contains("\nHave operation between variables")) {
            if (!checkComplicatedExpression(expression)) return response + "\nIs a complicated expression";
            else return response + "\nNot simple nor complicated expression ";
        } else {
            return response + "\nNot simple nor complicated expression ";
        }
    }

    private boolean checkComplicatedExpression(String expression) {
        String[] expressions = expression.split(" ");
        return expressions.length % 2 == 0;
    }
}
