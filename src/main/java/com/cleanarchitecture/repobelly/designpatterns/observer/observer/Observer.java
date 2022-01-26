package com.cleanarchitecture.repobelly.designpatterns.observer.observer;

import com.cleanarchitecture.repobelly.designpatterns.observer.generator.NumberGenerator;

public interface Observer {
    public abstract void update(NumberGenerator generator);
}
