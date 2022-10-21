package com.example.adapterex2;

import com.example.adapterex2.adapter.AdapterHDMI_VGA;
import com.example.adapterex2.adapter.PC;
import com.example.adapterex2.adapter.Tele;
import com.example.adapterex2.adapter.VideoProjector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterEx2Application {

    public static void main(String[] args) {
        PC pc=new PC();

        pc.setHdmi(new Tele());
        pc.afficher();

        AdapterHDMI_VGA adapter=new AdapterHDMI_VGA();
        pc.setHdmi(adapter);
        adapter.setVga(new VideoProjector());

        pc.afficher();
    }

}
