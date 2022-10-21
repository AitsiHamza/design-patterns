package com.example.observerex2;

import com.example.observerex2.observable.DonneesMeteo;
import com.example.observerex2.observer.Affichage_conditionsActuelles;
import com.example.observerex2.observer.Affichage_previsions;
import com.example.observerex2.observer.Affichage_statistiques;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ObserverEx2Application {

    public static void main(String[] args) {
        SpringApplication.run(ObserverEx2Application.class, args);
    }

    @Bean
    CommandLineRunner start(){
        return args->{
            DonneesMeteo observable=new DonneesMeteo();
            Affichage_conditionsActuelles observer1=new Affichage_conditionsActuelles();
            Affichage_previsions observer2=new Affichage_previsions();

            observable.addObserver(observer1);observable.addObserver(observer2);

            observable.setParams(0.12f,30.12f,10.12f);
            System.out.println("************************************************");
            Affichage_statistiques observer3=new Affichage_statistiques();
            observable.addObserver(observer3);
            observable.removeObserver(observer1);

            observable.setParams(1f,40f,5f);
            System.out.println("************************************************");

        };
    }

}
