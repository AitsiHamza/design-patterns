package com.example.observerex2.observer;

public class Affichage_statistiques implements Affichage {
    @Override
    public void affichage(float temperature, float pressure, float humidity) {
        System.out.println("Affichages des statistiques!");
        System.out.println("temperature:"+temperature+"" +
                "\tpressure:"+pressure+"" +
                "\thumidity:"+humidity);
        System.out.println("----------------------------");
    }
}
