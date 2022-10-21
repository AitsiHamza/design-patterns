package com.example.decoratorex1;

import com.example.decoratorex1.composant.ComposantAbstrait;
import com.example.decoratorex1.composant.ComposantConcretImpl1;
import com.example.decoratorex1.decorator.DecorateurConcretImpl1;
import com.example.decoratorex1.decorator.DecorateurConcretImpl2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorEx1Application {

    public static void main(String[] args) {
        ComposantAbstrait composantAbstrait=new ComposantConcretImpl1();
        composantAbstrait.operation();
        System.out.println("----------------------");
        System.out.println("Premiere decoration");
        System.out.println("----------------------");
        composantAbstrait=new DecorateurConcretImpl1(composantAbstrait);
        composantAbstrait.operation();
        System.out.println("----------------------");
        System.out.println("Deuxieme decoration");
        System.out.println("----------------------");
        composantAbstrait=new DecorateurConcretImpl2(composantAbstrait);
        composantAbstrait.operation();

    }

}
