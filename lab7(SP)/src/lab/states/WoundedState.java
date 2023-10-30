package lab.states;

import lab.Person;
import lab.State;

public class WoundedState implements State {

    @Override
    public String handle(Person person) {
        person.setState("norm");
        return "The bleeding was stopped. Total user hp: " + person.getHealth();
    }
}
