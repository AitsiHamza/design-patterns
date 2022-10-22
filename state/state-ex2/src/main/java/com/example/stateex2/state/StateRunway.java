package com.example.stateex2.state;

public class StateRunway extends State {
    public StateRunway(AirPlane airPlane) {
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
        System.out.println(esc+"+Entering the garage! ( runaway->garage )");
        airPlane.setEsc(esc+"\t");
        airPlane.setState(new StateGarage(airPlane));
    }

    @Override
    public void executeLanding() {
        String esc=airPlane.getEsc();
        System.out.println(esc+"-This plane is already in the ground!");
    }

    @Override
    public void executeTakeOff() {
        String esc=airPlane.getEsc();
        System.out.println(esc+"+Taking off! ( runaway->sky )");
        airPlane.setEsc(esc+"\t");
        airPlane.setState(new StateSky(airPlane));
    }

    @Override
    public void executeDoActivity() {
        String esc=airPlane.getEsc();
        System.out.println(esc+"*Activity in the runaway!");
    }
}
