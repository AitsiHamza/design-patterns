package com.example.adapterex1.adapter;

public class AdaptateurComposition implements Standard {
    private ImplAdaptee adaptee=new ImplAdaptee();
    @Override
    public void operation(int a, int b) {
        int r=adaptee.operation2(a,b);
        adaptee.operation3(r);
    }
}
