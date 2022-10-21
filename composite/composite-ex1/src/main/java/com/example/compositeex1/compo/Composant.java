package com.example.compositeex1.compo;

public abstract class Composant {
    protected String nom;
    protected int level;

    public Composant(String nom) {
        this.nom = nom;
    }

    public abstract void operation();
}
