package com.cleanarchitect.observer.generator;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{
    private Random random = new Random();
    private int number;

    @Override
    public void execute() {
        for(int i = 0; i < 20; i++ ) {
            number = random.nextInt(50);
            this.notifyObservers();
        }
    }
    
    @Override
    public int getNumber() {
        return this.number;
    }

    
}
