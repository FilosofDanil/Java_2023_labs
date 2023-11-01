package lab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class BasedComponent implements Component {
    @Override
    public String execute(String expression) {
        try {
            return calculate(expression);
        } catch (NoSuchElementException e) {
            return "No calculable";
        }
    }

    private String calculate(String expression) {
        return Double.toString(evaluate(expression));
    }

    public double evaluate(String expression) {
        Deque<Double> operands = new ArrayDeque<>();
        Deque<Character> operators = new ArrayDeque<>();

        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isNumeric(token)) {
                operands.push(Double.parseDouble(token));
            } else if (isOperator(token.charAt(0))) {
                while (!operators.isEmpty() && hasPrecedence(token.charAt(0), operators.peek())) {
                    applyOperation(operands, operators.pop());
                }
                operators.push(token.charAt(0));
            }
        }

        while (!operators.isEmpty()) {
            applyOperation(operands, operators.pop());
        }

        return operands.pop();
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private boolean hasPrecedence(char op1, char op2) {
        if ((op1 == '+' || op1 == '-') && (op2 == '*' || op2 == '/')) {
            return true;
        }
        return false;
    }

    private void applyOperation(Deque<Double> operands, char operator) {
        double operand2 = operands.pop();
        double operand1 = operands.pop();
        double result;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Ділення на нуль");
                }
                result = operand1 / operand2;
                break;
            default:
                throw new IllegalArgumentException("Невідомий оператор: " + operator);
        }

        operands.push(result);
    }
}
