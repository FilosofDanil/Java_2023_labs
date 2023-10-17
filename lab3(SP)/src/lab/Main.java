package lab;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {


    public static void main(String[] args) {
        //just calc
        Component basedComponent = new BasedComponent();
        System.out.println(basedComponent.execute("1 + 1"));


        //example block 1
        //check expression example 1
        System.out.println("example1");
        Component component = new ConstantDecorator(basedComponent);
        component = new VariableDecorator(component);
        component = new OperationDecorator(component);
        component = new ExpressionDecorator(component);
        System.out.println(component.execute("x"));
        System.out.println();

        //check expression example 2
        System.out.println("example2");
        System.out.println(component.execute("17"));
        System.out.println();
        //check expression example 3
        System.out.println("example3");
        System.out.println(component.execute("Slave"));
        System.out.println();
        //check expression example 4
        System.out.println("example4");
        System.out.println(component.execute("2 + 2 * 2"));
        System.out.println();
        //check expression example 5
        System.out.println("example5");
        System.out.println(component.execute("2 + 2 * "));
        System.out.println();

        //example block 2
        //example 6
        System.out.println("example6");
        Component exComponent1 = new ConstantDecorator(basedComponent);
        exComponent1 = new VariableDecorator(exComponent1);
        System.out.println(exComponent1.execute("10"));
        System.out.println();
        //example 7
        System.out.println("example7");
        System.out.println(exComponent1.execute("y"));

        //example block 3
        //example 8
        System.out.println("example8");
        Component exComponent2 = new OperationDecorator(basedComponent);
        exComponent2 = new ExpressionDecorator(exComponent2);
        System.out.println(exComponent2.execute("1 + 1"));
        System.out.println();
        //example 9
        System.out.println("example9");
        System.out.println(exComponent2.execute("k"));
    }

}
