package com.example.adapterex1.adapter;

public class ImplAdaptee {
    public int operation2(int a, int b){
        return a*b;
    }
    public void operation3(int x){
        System.out.println("Adaptée, Resultat="+x);
    }
}
