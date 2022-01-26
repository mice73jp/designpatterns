package com.cleanarchitecture.repobelly.designpatterns.mediator.mediator;

import com.cleanarchitecture.repobelly.designpatterns.mediator.colleague.Colleague;

public interface Mediator {
    public abstract void createColleagues();
    public abstract void colleagueChanged(Colleague colleague);
}
