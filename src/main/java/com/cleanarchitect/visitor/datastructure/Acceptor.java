package com.cleanarchitect.visitor.datastructure;

import com.cleanarchitect.visitor.visitor.Visitor;

public interface Acceptor {
    public abstract void accept(Visitor v);
}
