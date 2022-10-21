package com.example.observerex2.observer;

public class Affichage_conditionsActuelles implements Affichage {
    @Override
    public void affichage(float temperature, float pressure, float humidity) {
        System.out.println("Affichage des conditions actuelles!");
        System.out.println("temperature:"+temperature+"" +
                "\tpressure:"+pressure+"" +
                "\thumidity:"+humidity);
        System.out.println("----------------------------");
    }
}
