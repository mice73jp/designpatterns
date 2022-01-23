package com.cleanarchitect.observer.observer;

import com.cleanarchitect.observer.generator.NumberGenerator;

public interface Observer {
    public abstract void update(NumberGenerator generator);
}
