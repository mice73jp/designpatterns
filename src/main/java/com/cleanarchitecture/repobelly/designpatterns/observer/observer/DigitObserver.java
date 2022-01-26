package com.cleanarchitecture.repobelly.designpatterns.observer.observer;

import com.cleanarchitecture.repobelly.designpatterns.observer.generator.NumberGenerator;

public class DigitObserver implements Observer{

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
        
}
