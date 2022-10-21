package com.example.decoratorex1.decorator;

import com.example.decoratorex1.composant.ComposantAbstrait;

public abstract class DecorateurAbstrait implements ComposantAbstrait {
    protected ComposantAbstrait composantAbstrait;
    public DecorateurAbstrait(ComposantAbstrait composantAbstrait){
        super();
        this.composantAbstrait = composantAbstrait;
    }
}
