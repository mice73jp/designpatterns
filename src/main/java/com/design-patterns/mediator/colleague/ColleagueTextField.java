package com.cleanarchitect.mediator.colleague;

import com.cleanarchitect.mediator.mediator.Mediator;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        this.setEnabled(enabled);
        this.setBackground(enabled ? Color.white : Color.lightGray);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;        
    }

    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged(this);
    }
    
}
