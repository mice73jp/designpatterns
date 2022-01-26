package com.cleanarchitecture.repobelly.designpatterns.proxy.print;

public class PrinterProxy implements Printable{
    private String name;
    private Printer real;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return this.name;
    }
    @Override
    public void print(String string) {
        this.realize();
        real.print(string);
    }
    @Override
    public synchronized void setPrintName(String name) {
        if(real != null) {
            real.setPrintName(name);
        }
        this.name = name;
    }
    
    private synchronized void realize() {
        if(real == null) {
            real = new Printer(name);
        }
    }
}
