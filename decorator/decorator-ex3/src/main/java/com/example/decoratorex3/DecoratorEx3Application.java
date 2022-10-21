package com.example.decoratorex3;

import com.example.decoratorex3.decorator.DecrepteInputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DecoratorEx3Application {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("original.txt");

        is=new DecrepteInputStream(is);

        System.out.println(is.read());
    }

}
