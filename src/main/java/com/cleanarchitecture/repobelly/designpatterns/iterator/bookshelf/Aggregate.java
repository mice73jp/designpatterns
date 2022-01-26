package com.cleanarchitecture.repobelly.designpatterns.iterator.bookshelf;

public interface Aggregate {
    public abstract Iterator iterator();
    public abstract IteratorBF iteratorBF();
}
