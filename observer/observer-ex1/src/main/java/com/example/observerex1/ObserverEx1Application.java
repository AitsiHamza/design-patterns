package com.example.observerex1;

import com.example.observerex1.observable.ObservableImpl;
import com.example.observerex1.observer.ObserverImpl1;
import com.example.observerex1.observer.ObserverImpl2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverEx1Application {

    public static void main(String[] args) {
        ObservableImpl observable=new ObservableImpl();
        ObserverImpl1 o1=new ObserverImpl1();
        ObserverImpl2 o2=new ObserverImpl2();

        System.out.println("---changing state---");
        observable.setState(70);
        observable.addObserver(o1);
        observable.addObserver(o2);
        System.out.println("---changing state---");
        observable.setState(90);
        observable.removeObserver(o1);
        System.out.println("---changing state---");
        observable.setState(23);
    }

}
