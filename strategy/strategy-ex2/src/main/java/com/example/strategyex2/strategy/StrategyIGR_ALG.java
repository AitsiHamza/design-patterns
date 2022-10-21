package com.example.strategyex2.strategy;

public class StrategyIGR_ALG implements StrategyIGR {
    @Override
    public Double calculerIGR(Double salaireBrutMensuel) {
        Double igr = null;
        igr= salaireBrutMensuel*0.35*12;

        return igr;

    }
}
