package com.example.stateex2.state;

public class StateSky extends State {
    public StateSky(AirPlane airPlane) {
        super(airPlane);
    }

    @Override
    public void executeOutOfGarage() {
        String esc=airPlane.getEsc();
        System.out.println(esc+"-This plane is already out of the garage!");
    }

    @Override
    public void executeIntoGarage() {
        String esc=airPlane.getEsc();
        System.out.println(esc+"-This plane is in the sky!");
    }

    @Override
    public void executeLanding() {
        String esc=airPlane.getEsc();
        System.out.println(esc+"+Landing! ( sky->runaway )");
        airPlane.setEsc(esc+"\t");
        airPlane.setState(new StateRunway(airPlane));
    }

    @Override
    public void executeTakeOff() {
        String esc=airPlane.getEsc();
        System.out.println(esc+"-This plane has already taken off!");
    }

    @Override
    public void executeDoActivity() {
        String esc=airPlane.getEsc();
        System.out.println(esc+"*Activity in the sky!");
    }
}
