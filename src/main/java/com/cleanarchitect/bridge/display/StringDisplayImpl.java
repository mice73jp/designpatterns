package com.cleanarchitect.bridge.display;

public class StringDisplayImpl extends DisplayImpl{
    private String string;
    private int width;
    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void rawClose() {
        this.printLine();
    }
    @Override
    public void rawOpen() {
        this.printLine();
    }
    @Override
    public void rawPrint() {
        System.out.println("|" + this.string + "|");
    }

    private void printLine() {
        System.out.print("+");
        for(int i=0; i < width; i++ ) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
