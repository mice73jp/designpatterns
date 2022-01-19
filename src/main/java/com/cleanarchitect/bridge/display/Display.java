package com.cleanarchitect.bridge.display;

public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }
    public void print() {
        impl.rawPrint();
    }
    public void close() {
        impl.rawClose();
    }

    public final void display() {
        this.open();
        this.print();
        this.close();
    }
}
