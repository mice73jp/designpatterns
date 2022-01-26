package com.cleanarchitecture.repobelly.designpatterns.template;

import com.cleanarchitecture.repobelly.designpatterns.template.display.AbstractDisplay;
import com.cleanarchitecture.repobelly.designpatterns.template.display.impl.CharDisplay;
import com.cleanarchitecture.repobelly.designpatterns.template.display.impl.StringDisplay;

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
