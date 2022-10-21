package com.example.compositeex2.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    List<Component> components=new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void operation() {
        String tab="";
        for(int i=0;i<level;i++)tab+="\t";
        System.out.println(tab+"Folder : "+name);
        components.forEach(c->c.operation());
    }

    public void add(Component component){
        component.level=this.level+1;
        components.add(component);
    }

}
