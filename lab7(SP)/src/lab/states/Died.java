package lab.states;

import lab.Person;
import lab.State;

public class Died implements State {
    @Override
    public String handle(Person person) {
        return "Person " + person.getName() + " died " + "\n" +
                "Total pushed: " + person.getStats().getKgsPushed() + "\n" +
                "Total ran: " + person.getStats().getMetresCrossed();
    }
}
