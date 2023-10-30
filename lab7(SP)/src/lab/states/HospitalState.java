package lab.states;

import lab.Person;
import lab.State;

public class HospitalState implements State {
    @Override
    public String handle(Person person) {
        if(person.getHealth()>=100){
            person.setState("norm");
            return "You don't need the treatment anymore";
        }
        person.setHealth(person.getHealth() + 5);
        return "Healed: " + 5 + "\n" + "Total hp: " + person.getHealth();
    }
}
