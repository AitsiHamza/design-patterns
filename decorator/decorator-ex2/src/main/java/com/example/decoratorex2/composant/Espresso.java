package com.example.decoratorex2.composant;

public class Espresso extends Boisson {
    public Espresso(){
        description="Espresso";
    }
    @Override
    public double cout() {
        return 1.99;
    }
}
