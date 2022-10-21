package com.example.compositeex2;

import com.example.compositeex2.composite.Component;
import com.example.compositeex2.composite.File;
import com.example.compositeex2.composite.Folder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositeEx2Application {

    public static void main(String[] args) {
        Folder folder1=new Folder("hamza-aitsi_tds");
        Folder folder2=new Folder("hamza-aitsi_td-docker");
        Folder folder3=new Folder("hamza-aitsi_td-kubernetes");

        folder1.add(folder2);
        folder1.add(folder3);

        folder2.add(new File("Dockerfile"));
        folder2.add(new File("Docker-compose"));

        folder3.add(new File("exo1"));
        folder3.add(new File("exo2"));

        folder1.operation();
    }

}
