package com.cleanarchitecture.repobelly.designpatterns.mediator.colleague;

import java.awt.Button;

import com.cleanarchitecture.repobelly.designpatterns.mediator.mediator.Mediator;

public class ColleagueButton extends Button implements Colleague{
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        this.setEnabled(enabled);
    }
}
