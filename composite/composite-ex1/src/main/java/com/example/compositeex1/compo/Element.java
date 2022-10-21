package com.example.compositeex1.compo;

public class Element extends Composant{
    public Element(String nom) {
        super(nom);
    }

    @Override
    public void operation() {
        String tab="";
        for (int i = 0; i < level; i++) {
            tab+="--";
        }
        System.out.println(tab+"Operation sur l'element ("+nom+")");
    }
}
