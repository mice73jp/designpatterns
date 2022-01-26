package com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility.support;

import com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility.trouble.Trouble;

public class NoSupport extends Support{

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
    
}
