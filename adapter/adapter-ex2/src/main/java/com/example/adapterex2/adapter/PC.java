package com.example.adapterex2.adapter;

public class PC {
    private HDMI hdmi;

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    public void afficher(){
        this.hdmi.signal("pc -> hdmi ");
    }
}
