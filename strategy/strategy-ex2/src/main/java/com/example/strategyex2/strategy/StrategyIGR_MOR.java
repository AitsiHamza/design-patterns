package com.example.strategyex2.strategy;

public class StrategyIGR_MOR implements StrategyIGR {
    @Override
    public Double calculerIGR(Double salaireBrutMensuel) {
        Double igr = null;
        if(salaireBrutMensuel<=40000)igr= salaireBrutMensuel*0.05*12;
        if(salaireBrutMensuel>40000 && salaireBrutMensuel<=120000)igr= salaireBrutMensuel*0.2*12;
        if(salaireBrutMensuel>120000)igr= salaireBrutMensuel*0.42*12;

        return igr;
    }
}
