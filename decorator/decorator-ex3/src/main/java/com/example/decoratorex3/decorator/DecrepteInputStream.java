package com.example.decoratorex3.decorator;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DecrepteInputStream extends DecorateurInputStream {
    public DecrepteInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {

        int c=inputStream.read();
        List<Integer> list = new ArrayList<>();

        while(c!=-1){
            System.out.println(c);
            list.add(c);
            c=inputStream.read();
        }

        String res="";
        for (int i = 0; i <= list.size()-2; i=i+2) {
            res+=list.get(i)-list.get(i+1);
        }

        System.out.println("------------");

        return Integer.parseInt(res);
    }

}
