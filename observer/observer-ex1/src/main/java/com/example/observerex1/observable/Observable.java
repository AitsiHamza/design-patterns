package com.example.observerex1.observable;

import com.example.observerex1.observer.Observer;

public interface Observable {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
