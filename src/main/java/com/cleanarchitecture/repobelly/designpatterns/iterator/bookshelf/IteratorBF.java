package com.cleanarchitecture.repobelly.designpatterns.iterator.bookshelf;

public interface IteratorBF {
    public abstract boolean hasNext();
    public abstract Object next();
    public abstract boolean hasPrev();
    public abstract Object prev();
}
