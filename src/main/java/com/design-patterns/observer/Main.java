package com.cleanarchitect.observer;

import com.cleanarchitect.observer.generator.NumberGenerator;
import com.cleanarchitect.observer.generator.RandomNumberGenerator;
import com.cleanarchitect.observer.observer.DigitObserver;
import com.cleanarchitect.observer.observer.GraphObserver;
import com.cleanarchitect.observer.observer.Observer;

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
