package com.example.decoratorex1.decorator;

import com.example.decoratorex1.composant.ComposantAbstrait;

public class DecorateurConcretImpl2 extends DecorateurAbstrait {
    public DecorateurConcretImpl2(ComposantAbstrait composantAbstrait) {
        super(composantAbstrait);
    }

    @Override
    public void operation() {
        System.out.println("Decorateur 2 : avant, je fais A");
        composantAbstrait.operation();
        System.out.println("Decorateur 2 : apres, je fais B");
    }
}
