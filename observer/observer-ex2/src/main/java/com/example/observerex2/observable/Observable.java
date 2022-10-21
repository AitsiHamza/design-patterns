package com.example.observerex2.observable;


import com.example.observerex2.observer.Affichage;

public interface Observable {
    void addObserver(Affichage o);
    void removeObserver(Affichage o);
    void notifyObservers();
}
