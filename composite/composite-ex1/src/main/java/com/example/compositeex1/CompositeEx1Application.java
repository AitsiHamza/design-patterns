package com.example.compositeex1;

import com.example.compositeex1.compo.Composite;
import com.example.compositeex1.compo.Element;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositeEx1Application {

    public static void main(String[] args) {
        Composite racine=new Composite("Composite 1");
        Composite comoposite2=new Composite("Composite 2");

        racine.add(comoposite2);

        racine.add(new Element("Element 11"));
        racine.add(new Element("Element 12"));
        racine.add(new Element("Element 13"));

        comoposite2.add(new Element("Element 21"));
        comoposite2.add(new Element("Element 22"));

        racine.operation();
    }

}
