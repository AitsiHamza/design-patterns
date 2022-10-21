package com.example.strategyex1;

import com.example.strategyex1.context.Context;
import com.example.strategyex1.strategy.StrategyImpl1;
import com.example.strategyex1.strategy.StrategyImpl2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyEx1Application {

    public static void main(String[] args) {
        Context ctx=new Context();
        System.out.println("Stratégie 1:");
        ctx.setStrategy(new StrategyImpl1());
        ctx.applyStrategy();
        System.out.println("Stratégie 2:");
        ctx.setStrategy(new StrategyImpl2());
        ctx.applyStrategy();
    }

}
