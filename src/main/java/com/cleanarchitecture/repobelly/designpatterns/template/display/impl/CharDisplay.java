package com.cleanarchitecture.repobelly.designpatterns.template.display.impl;

import com.cleanarchitecture.repobelly.designpatterns.template.display.AbstractDisplay;

public class CharDisplay extends AbstractDisplay{
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void close() {
        System.out.println(">>");
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }
}
