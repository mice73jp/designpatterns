package com.cleanarchitecture.repobelly.designpatterns.observer.generator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cleanarchitecture.repobelly.designpatterns.observer.observer.Observer;

public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator it = observers.iterator();
        while(it.hasNext()) {
            Observer ob = (Observer)it.next();
            ob.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
