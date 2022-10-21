package com.example.compositeex1.compo;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Composant{
    private List<Composant> composants = new ArrayList<>();

    public Composite(String nom) {
        super(nom);
    }

    @Override
    public void operation() {
        String tab="";
        for(int i=0;i<level;i++)tab+="--";
        System.out.println(tab+"Operation sur un composite("+nom+")");
        composants.forEach(c->c.operation());
    }

    public void add(Composant composant){
        composant.level=this.level+1;;
        composants.add(composant);
    }

    public void remove(Composant composant){
        composants.remove(composant);
    }

    public List<Composant> getChilds(){
        return composants;
    }
}
