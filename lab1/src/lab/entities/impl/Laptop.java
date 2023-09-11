package lab.entities.impl;

import lab.entities.Device;

public class Laptop extends Device {
    private boolean playing;
    private boolean working;
    private boolean surfing;

    public Laptop(double initialPower) {
        super(initialPower);
    }

    public void working() {
        this.working = true;
    }

    public void playingGames() {
        this.playing = true;
    }

    public void surfingIntenet() {
        this.surfing = true;
    }

    @Override
    public double getInitialPower() {
        double performanceUsage = checkPerformanceUsage();
        return super.getInitialPower() * performanceUsage;
    }

    private double checkPerformanceUsage() {
        double performance = 0.7;
        if (working) {
            performance += 0.3;
        }
        if (playing) {
            performance += 0.7;
        }
        if (surfing) {
            performance += 0.1;
        }
        return performance;
    }

}
