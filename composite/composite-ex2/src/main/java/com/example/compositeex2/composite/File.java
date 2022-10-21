package com.example.compositeex2.composite;

import java.util.ArrayList;
import java.util.List;

public class File extends Component {

    public File(String name) {
        super(name);
    }

    @Override
    public void operation() {
        String tab="";
        for(int i=0;i<level;i++)tab+="\t";
        System.out.println(tab+"File : "+name);
    }

}
