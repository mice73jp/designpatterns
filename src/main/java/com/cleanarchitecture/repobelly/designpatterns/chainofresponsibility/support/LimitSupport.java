package com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility.support;

import com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility.trouble.Trouble;

public class LimitSupport extends Support{
    private int limit;
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < this.limit;
    }
    
}
