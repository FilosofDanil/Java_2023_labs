package lab;

import lab.states.*;

public class Person {
    private String name;

    private int speed;

    private int strength;

    private int health;

    private State state;

    private Stats stats;

    public void setState(String state) {
        if(this.state instanceof Died){
            System.out.println("You're died man!");
            return;
        }
        if (state.equals("run") || state.equals("push barbel")) {
            if (this.state instanceof WoundedState) {
                System.out.println("You need to take a bandage");
                return;
            }
        }
        if (state.equals("run")) {
            this.state = new RunningState();
        } else if (state.equals("push barbel")) {
            this.state = new BenchState();
        } else if (state.equals("cut")) {
            this.health -= 10;
            if(this.health<=0){
                this.state = new Died();
                return;
            }
            this.state = new WoundedState();
        } else if (state.equals("hospital")) {
            this.state = new HospitalState();
        } else if (state.equals("norm")) {
            this.state = new NormalState();
        }
    }

    public String doAction() {
        return this.state.handle(this);
    }

    public Person(String name, int speed, int strength) {
        this.name = name;
        this.speed = speed;
        this.strength = strength;
        this.health = 100;
        this.stats = new Stats();
        this.state = new NormalState();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
