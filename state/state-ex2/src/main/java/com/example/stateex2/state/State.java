package com.example.stateex2.state;

public abstract class State {
    protected AirPlane airPlane;

    public State(AirPlane airPlane) {
        this.airPlane = airPlane;
    }

    public abstract void executeOutOfGarage();
    public abstract void executeIntoGarage();
    public abstract void executeLanding();
    public abstract void executeTakeOff();
    public abstract void executeDoActivity();

}
