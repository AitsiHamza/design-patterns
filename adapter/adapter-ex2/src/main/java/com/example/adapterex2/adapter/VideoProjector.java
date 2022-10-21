package com.example.adapterex2.adapter;

public class VideoProjector implements VGA{

    @Override
    public void signal(String str) {
        System.out.println(str+" - vga <- VideoProjector");
    }
}
