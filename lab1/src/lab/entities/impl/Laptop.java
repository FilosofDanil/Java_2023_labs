package lab.entities.impl;

import lab.entities.Device;

public class Laptop extends Device {
    private boolean playing;
    private boolean working;
    private boolean surfing;

    public Laptop(double initialPower, boolean inSocket, String activity) {
        super(initialPower, inSocket);
        if (activity.equals("playing")) playing = true;
        else if (activity.equals("working")) working = true;
        else if (activity.equals("surfing")) surfing = true;
    }

    @Override
    public double getInitialPower() {
        double performanceUsage = checkPerformanceUsage();
        return super.getInitialPower() * performanceUsage;
    }

    private double checkPerformanceUsage() {
        double performance = 0.75;
        if (working) {
            performance += 0.25;
        }
        if (playing) {
            performance += 0.75;
        }
        if (surfing) {
            performance += 0.15;
        }
        return performance;
    }

    @Override
    public String toString() {
        return "Laptop " +
                "initialPower=" + super.getInitialPower() +
                " \n";
    }
}
