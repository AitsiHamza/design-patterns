package com.example.decoratorex2.decorator;

import com.example.decoratorex2.composant.Boisson;

public abstract class DecorateurIngredient extends Boisson {
    protected Boisson boisson;
    public DecorateurIngredient(Boisson boisson){
        this.boisson = boisson;
    }
    public abstract String getDescription();
}
