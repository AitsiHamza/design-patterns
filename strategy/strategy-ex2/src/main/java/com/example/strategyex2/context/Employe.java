package com.example.strategyex2.context;

import com.example.strategyex2.strategy.StrategyIGR;

public class Employe {
    private String cin;
    private Double salaireBrutMensuel;
    protected StrategyIGR strategy;

    public Employe(String cin, Double salaireBrutMensuel,StrategyIGR strategy) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
        this.strategy=strategy;
    }

    @Override
    public String toString() {
        return "\ncin=" + cin + "\t|\tsalaire brut mensuel=" + salaireBrutMensuel + "\t|\tsalaire net mensuel=" + getSalaireNetMensuel();
    }

    public Double calculerIGR(){
        return strategy.calculerIGR(salaireBrutMensuel);
    }

    public Double getSalaireNetMensuel() {
        return (salaireBrutMensuel*12-calculerIGR())/12;
    }
}
