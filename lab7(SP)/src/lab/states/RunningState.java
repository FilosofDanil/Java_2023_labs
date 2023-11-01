package lab.states;

import lab.Person;
import lab.State;
import lab.Stats;

public class RunningState implements State {

    @Override
    public String handle(Person person) {
        if(person.getHealth()<=25){
            return "You can't run any distance, before you get the treatment";
        }
        Stats stats = person.getStats();
        int speed = person.getStrength() * 100;
        if (stats.getMetresCrossed() / speed == 3) {
            person.setState("cut");
            return "You've being injured";
        }
        stats.setMetresCrossed(stats.getMetresCrossed() + speed);
        return person.getName() + " Metres crossed " + speed + "\n"
                + "totally ran: " + person.getStats().getMetresCrossed();
    }
}
