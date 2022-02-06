package com.cleanarchitect.composite.entry;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();

    protected abstract void printList(String prefix);

    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public void printList() {
        this.printList("");
    }

    public String toString() {
        return this.getName() + " (" + this.getSize() + ") ";
    }
}
