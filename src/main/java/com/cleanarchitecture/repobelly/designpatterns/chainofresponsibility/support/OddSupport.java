package com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility.support;

import com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility.trouble.Trouble;

public class OddSupport extends Support{

    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 > 0;
    }
    
}
