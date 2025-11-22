package org.example.task3;

public class Smartphone implements GPS, Cellular {
    @Override
    public void makeCall() { System.out.println("Calling..."); }
    @Override
    public void receiveCall() { System.out.println("Incoming call..."); }
    @Override
    public double[] getCoordinates() { return new double[]{50.45, 30.52}; }
}