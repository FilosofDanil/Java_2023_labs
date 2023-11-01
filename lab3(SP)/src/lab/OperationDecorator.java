package lab;

public class OperationDecorator extends BasedDecorator {
    public OperationDecorator(Component component) {
        super(component);
    }

    @Override
    public String execute(String expression) {
        if(expression.contains("+") || expression.contains("-")
                || expression.contains("*") || expression.contains("/")){
            return super.execute(expression) + "\nHave operation between variables";
        } else {
          return super.execute(expression) + "\nHave not any operation";
        }
    }
}
