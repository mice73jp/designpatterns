package com.cleanarchitect.chainofresponsibility.support;

import com.cleanarchitect.chainofresponsibility.trouble.Trouble;

public class OddSupport extends Support{

    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 > 0;
    }
    
}
