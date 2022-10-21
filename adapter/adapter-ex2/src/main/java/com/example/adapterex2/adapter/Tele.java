package com.example.adapterex2.adapter;

public class Tele implements HDMI {
    @Override
    public void signal(String str) {
        System.out.println(str+" - hdmi <- Tele");
    }
}
