package com.example.adapterex1.adapter;

public class StandardImpl1 implements Standard {
    @Override
    public void operation(int a, int b) {
        System.out.println("Standard, Resultat est : "+a*b);
    }
}
