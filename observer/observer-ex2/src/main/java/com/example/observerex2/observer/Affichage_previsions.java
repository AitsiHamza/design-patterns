package com.example.observerex2.observer;

public class Affichage_previsions implements Affichage {
    @Override
    public void affichage(float temperature, float pressure, float humidity) {
        System.out.println("Affichages des previsions!");
        System.out.println("temperature:"+temperature+"" +
                "\tpressure:"+pressure+"" +
                "\thumidity:"+humidity);
        System.out.println("----------------------------");
    }
}
