package com.example.observerex2.observable;

import com.example.observerex2.observer.Affichage;

import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo implements Observable {
    private List<Affichage> observers=new ArrayList<>();
    float temperature;
    float pressure;
    float humidity;

    @Override
    public void addObserver(Affichage o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Affichage o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o->o.affichage(temperature,pressure,humidity));
    }

    public void setParams(float temperature,float pressure,float humidity){
        setTemperature(temperature);
        setPressure(pressure);
        setHumidity(humidity);
        notifyObservers();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
