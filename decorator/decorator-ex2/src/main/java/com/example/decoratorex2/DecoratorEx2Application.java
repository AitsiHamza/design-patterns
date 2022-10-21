package com.example.decoratorex2;

import com.example.decoratorex2.composant.Boisson;
import com.example.decoratorex2.composant.Colombia;
import com.example.decoratorex2.composant.Espresso;
import com.example.decoratorex2.decorator.Caramel;
import com.example.decoratorex2.decorator.Chocolat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorEx2Application {

    public static void main(String[] args) {
        Boisson b1=new Espresso();
        System.out.println(b1.getDescription()+" $ "+b1.cout());

        Boisson b2=new Colombia();
        b2=new Caramel(b2);
        b2=new Chocolat(b2);
        System.out.println(b2.getDescription()+" $ "+b2.cout());

    }

}
