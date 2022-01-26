package com.cleanarchitect.chainofresponsibility.support;

import com.cleanarchitect.chainofresponsibility.trouble.Trouble;

public class NoSupport extends Support{

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
    
}
