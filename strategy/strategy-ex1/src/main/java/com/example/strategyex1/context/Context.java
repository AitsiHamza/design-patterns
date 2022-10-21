package com.example.strategyex1.context;

import com.example.strategyex1.strategy.Strategy;

public class Context {
    protected Strategy strategy;
    public void applyStrategy(){
        strategy.operationStrategy();

    }
    public void setStrategy(Strategy strategy) {

        this.strategy = strategy;

    }
}
