package com.cleanarchitecture.repobelly.designpatterns.visitor.datastructure;

import com.cleanarchitecture.repobelly.designpatterns.visitor.visitor.Visitor;

public interface Acceptor {
    public abstract void accept(Visitor v);
}
