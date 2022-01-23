package com.cleanarchitect.chainofresponsibility.support;

import com.cleanarchitect.chainofresponsibility.trouble.Trouble;

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
