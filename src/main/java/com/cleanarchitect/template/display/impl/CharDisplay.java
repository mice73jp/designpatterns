package com.cleanarchitect.template.display.impl;

import com.cleanarchitect.template.display.AbstractDisplay;

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
