package com.example.adapterex2.adapter;

public class AdapterHDMI_VGA implements HDMI {
    private VGA vga;

    @Override
    public void signal(String str) {
        vga.signal(str+" - hdmi <- adapter -> vga");
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }
}
