package com.cleanarchitect.template;

import com.cleanarchitect.template.display.AbstractDisplay;
import com.cleanarchitect.template.display.impl.CharDisplay;
import com.cleanarchitect.template.display.impl.StringDisplay;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay dispFirst = new CharDisplay('T');
        dispFirst.display();

        AbstractDisplay dispSecond = new StringDisplay("Hellow Template Method!!");
        dispSecond.display();

        dispSecond = new StringDisplay("アブラムシはtotemo気持ちわるのじゃ！！");
        dispSecond.display();
    }
}
