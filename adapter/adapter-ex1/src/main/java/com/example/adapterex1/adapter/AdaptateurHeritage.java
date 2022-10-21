package com.example.adapterex1.adapter;

public class AdaptateurHeritage extends ImplAdaptee implements Standard {
    @Override
    public void operation(int a, int b) {
        int r=operation2(a,b);
        operation3(r);
    }
}
