package lab.states;

import lab.Person;
import lab.State;

public class NormalState implements State {

    @Override
    public String handle(Person person) {
        return "Nothing have done! User stats: + \n" +
                "Total pushed: " + person.getStats().getKgsPushed() + "\n" +
                "Total ran: " + person.getStats().getMetresCrossed();
    }
}
