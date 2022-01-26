package com.cleanarchitect.mediator.mediator;

import com.cleanarchitect.mediator.colleague.Colleague;

public interface Mediator {
    public abstract void createColleagues();
    public abstract void colleagueChanged(Colleague colleague);
}
