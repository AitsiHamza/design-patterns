package com.example.observerex1.observer;

import com.example.observerex1.observable.Observable;
import com.example.observerex1.observable.ObservableImpl;

public class ObserverImpl2 implements Observer {
    @Override
    public void update(Observable o) {
        int newState = ((ObservableImpl)o).getState();
        System.out.println("Observer 2 received a new value : "+newState);
    }
}
