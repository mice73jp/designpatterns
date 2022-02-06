package com.cleanarchitect.mediator.colleague;

import com.cleanarchitect.mediator.mediator.Mediator;

public interface Colleague {
    public abstract void setMediator(Mediator mediator);
    public abstract void setColleagueEnabled(boolean enabled);
}
