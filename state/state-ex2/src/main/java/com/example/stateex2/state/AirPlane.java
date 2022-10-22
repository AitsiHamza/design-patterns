package com.example.stateex2.state;

public class AirPlane {
    protected  State state;
    protected String esc;

    public AirPlane() {
        this.state = new StateRunway(this);
        this.esc = "";
    }

    public void outOfGarage() {
        state.executeOutOfGarage();
    }

    public void intoGarage() {
        state.executeIntoGarage();
    }

    public void landing() {
        state.executeLanding();
    }

    public void takeOff() {
        state.executeTakeOff();
    }

    public void doActivity() {
        state.executeDoActivity();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public String getEsc() {
        return esc;
    }

    public void setEsc(String esc) {
        this.esc = esc;
    }
}
