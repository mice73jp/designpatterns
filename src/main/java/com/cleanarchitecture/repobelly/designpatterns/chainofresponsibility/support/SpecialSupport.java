package com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility.support;

import com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility.trouble.Trouble;

public class SpecialSupport extends Support{
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == this.number;
    }
    
}
