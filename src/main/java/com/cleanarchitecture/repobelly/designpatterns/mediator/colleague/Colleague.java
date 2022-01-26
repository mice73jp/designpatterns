package com.cleanarchitecture.repobelly.designpatterns.mediator.colleague;

import com.cleanarchitecture.repobelly.designpatterns.mediator.mediator.Mediator;

public interface Colleague {
    public abstract void setMediator(Mediator mediator);
    public abstract void setColleagueEnabled(boolean enabled);
}
