package com.example.decoratorex2.decorator;

import com.example.decoratorex2.composant.Boisson;

public class Chocolat extends DecorateurIngredient {
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+", Chocolat";
    }

    @Override
    public double cout() {
        System.out.println("calcul chocolat");
        return 0.22+ boisson.cout();
    }
}
