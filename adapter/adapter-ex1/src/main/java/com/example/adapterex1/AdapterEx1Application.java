package com.example.adapterex1;

import com.example.adapterex1.adapter.AdaptateurComposition;
import com.example.adapterex1.adapter.AdaptateurHeritage;
import com.example.adapterex1.adapter.Standard;
import com.example.adapterex1.adapter.StandardImpl1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdapterEx1Application {

    public static void main(String[] args) {
        Standard standard=new StandardImpl1();
        standard.operation(7,9);
        Standard adaptee1=new AdaptateurHeritage();
        adaptee1.operation(7,9);
        Standard adaptee2=new AdaptateurComposition();
        adaptee1.operation(7,9);
    }

}
