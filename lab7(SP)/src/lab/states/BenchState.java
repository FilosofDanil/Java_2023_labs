package lab.states;

import lab.Person;
import lab.State;
import lab.Stats;

public class BenchState implements State {

    @Override
    public String handle(Person person) {
        if(person.getHealth()<=50){
            return "You can't push the weights, before you get the treatment";
        }
        int strength = person.getStrength();
        Stats stats = person.getStats();
        if (stats.getKgsPushed() / strength == 10) {
            person.setState("cut");
            return "You've being injured";
        }
        stats.setKgsPushed(stats.getKgsPushed() + strength);
        return person.getName() + " pushed " + strength + "\n"
                + "totally pushed: " + person.getStats().getKgsPushed();
    }
}
