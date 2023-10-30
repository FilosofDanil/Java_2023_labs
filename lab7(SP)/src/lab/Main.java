package lab;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person("Danylo", 20, 80);
        System.out.println(person.doAction());
        System.out.println();
        System.out.println("run");
        person.setState("run");
        System.out.println(person.doAction());
        System.out.println(person.doAction());
        System.out.println(person.doAction());
        System.out.println(person.doAction());
        System.out.println(person.doAction());
        System.out.println();
        System.out.println("push state");
        person.setState("push barbel");
        System.out.println(person.doAction());
        System.out.println(person.doAction());
        System.out.println(person.doAction());
        System.out.println(person.doAction());
        System.out.println(person.doAction());
        System.out.println();
        System.out.println("Then let's drop our hp down");
        cut(person);
        cut(person);
        cut(person);
        cut(person);
        cut(person);
        cut(person);
        System.out.println();
        System.out.println("Let's push one more");
        person.setState("push barbel");
        System.out.println(person.doAction());
        System.out.println();
        System.out.println("Let's get the treatment");
        person.setState("hospital");
        System.out.println(person.doAction());
        System.out.println(person.doAction());
        System.out.println(person.doAction());
        System.out.println(person.doAction());
        System.out.println(person.doAction());
        System.out.println(person.doAction());
        System.out.println();
        System.out.println("Now pushing");
        person.setState("push barbel");
        System.out.println();
        System.out.println("Now let's kill our person ^(");
        System.out.println(person.doAction());
        cut(person);
        cut(person);
        cut(person);
        cut(person);
        cut(person);
        cut(person);
        System.out.println();
        System.out.println("Try to push from the grave");
        person.setState("push barbel");
    }

    public static void cut(Person person){
        person.setState("cut");
        System.out.println(person.doAction());
    }
}
