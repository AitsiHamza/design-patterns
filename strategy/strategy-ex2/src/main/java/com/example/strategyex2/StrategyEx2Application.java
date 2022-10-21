package com.example.strategyex2;

import com.example.strategyex2.context.Employe;
import com.example.strategyex2.strategy.StrategyIGR_ALG;
import com.example.strategyex2.strategy.StrategyIGR_MOR;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyEx2Application {

    public static void main(String[] args) {
        Employe e1=new Employe("T231321",55000.00,new StrategyIGR_MOR());
        System.out.println(e1);
        Employe e2=new Employe("Q654654",55000.00,new StrategyIGR_ALG());
        System.out.println(e2);
    }

}
