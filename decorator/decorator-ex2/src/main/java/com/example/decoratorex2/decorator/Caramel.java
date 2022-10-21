package com.example.decoratorex2.decorator;

import com.example.decoratorex2.composant.Boisson;

public class Caramel extends DecorateurIngredient {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+", Caramel";
    }

    @Override
    public double cout() {
        System.out.println("calcul caramel");
        return 0.22+ boisson.cout();
    }
}
