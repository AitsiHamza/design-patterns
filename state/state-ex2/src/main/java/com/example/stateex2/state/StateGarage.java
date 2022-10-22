package com.example.stateex2.state;

public class StateGarage extends State {
    public StateGarage(AirPlane airPlane) {
            super(airPlane);
    }

    @Override
    public void executeOutOfGarage() {
        String esc=airPlane.getEsc();
        System.out.println(esc+"+Entering the runaway!(garage->runaway)");
        airPlane.setEsc(esc+"\t");
        airPlane.setState(new StateRunway(airPlane));
    }

    @Override
    public void executeIntoGarage() {
        String esc=airPlane.getEsc();
        System.out.println(esc+"-This plane is already in the garage!");
    }

    @Override
    public void executeLanding() {
        String esc=airPlane.getEsc();
        System.out.println(esc+"-This plane is already in the ground!");
    }

    @Override
    public void executeTakeOff() {
        String esc=airPlane.getEsc();
        System.out.println(esc+"-This plane is not in the runaway yet!");
    }

    @Override
    public void executeDoActivity() {
        String esc=airPlane.getEsc();
        System.out.println(esc+"*Activity in the garage!");
    }
}
