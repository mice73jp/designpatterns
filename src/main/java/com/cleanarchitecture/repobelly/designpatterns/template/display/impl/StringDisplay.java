package com.cleanarchitecture.repobelly.designpatterns.template.display.impl;

import com.cleanarchitecture.repobelly.designpatterns.template.display.AbstractDisplay;

public class StringDisplay extends AbstractDisplay{
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public void close() {
        this.printLine();
    }

    @Override
    public void open() {
        this.printLine();
    }

    @Override
    public void print() {
        System.out.println("|"+ this.string + "|");
    }
    
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < string.length(); i++) {
            String oneChar = string.substring(i, i+1);
            if ( oneChar.getBytes().length > 1 ) {
                System.out.print("--");
            } else {
                System.out.print("-");
            }
            
        }
        System.out.println("+");
    }
}
