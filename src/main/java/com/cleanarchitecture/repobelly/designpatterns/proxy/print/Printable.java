package com.cleanarchitecture.repobelly.designpatterns.proxy.print;

public interface Printable {
    public abstract void setPrintName(String name);
    public abstract String getPrintName();
    public abstract void print(String string);
}
