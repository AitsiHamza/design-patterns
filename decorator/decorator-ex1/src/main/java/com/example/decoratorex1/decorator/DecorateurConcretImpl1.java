package com.example.decoratorex1.decorator;

import com.example.decoratorex1.composant.ComposantAbstrait;

public class DecorateurConcretImpl1 extends DecorateurAbstrait {
    public DecorateurConcretImpl1(ComposantAbstrait composantAbstrait) {
        super(composantAbstrait);
    }

    @Override
    public void operation() {
        System.out.println("Decorateur 1 : avant, je fais X");
        composantAbstrait.operation();
        System.out.println("Decorateur 1 : apres, je fais Y");
    }
}
