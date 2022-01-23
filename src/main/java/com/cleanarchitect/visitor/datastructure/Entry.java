package com.cleanarchitect.visitor.datastructure;

import java.util.Iterator;

public abstract class Entry implements Acceptor{
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry add) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public String toString() {
        return this.getName() + "( " + this.getSize() + " )";
    }
}
