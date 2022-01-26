package com.cleanarchitecture.repobelly.designpatterns.observer;

import com.cleanarchitecture.repobelly.designpatterns.observer.generator.NumberGenerator;
import com.cleanarchitecture.repobelly.designpatterns.observer.generator.RandomNumberGenerator;
import com.cleanarchitecture.repobelly.designpatterns.observer.observer.DigitObserver;
import com.cleanarchitecture.repobelly.designpatterns.observer.observer.GraphObserver;
import com.cleanarchitecture.repobelly.designpatterns.observer.observer.Observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
