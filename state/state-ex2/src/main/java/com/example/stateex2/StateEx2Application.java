package com.example.stateex2;

import com.example.stateex2.state.AirPlane;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StateEx2Application {

    public static void main(String[] args) {
        AirPlane airPlane=new AirPlane();
        airPlane.doActivity();
        airPlane.outOfGarage();
        airPlane.intoGarage();
        airPlane.outOfGarage();
        airPlane.takeOff();
        airPlane.intoGarage();
        airPlane.landing();
        airPlane.doActivity();
    }

}
