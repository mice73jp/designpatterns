package com.cleanarchitecture.repobelly.designpatterns.bridge;

import com.cleanarchitecture.repobelly.designpatterns.bridge.display.CountDisplay;
import com.cleanarchitecture.repobelly.designpatterns.bridge.display.Display;
import com.cleanarchitecture.repobelly.designpatterns.bridge.display.StringDisplayImpl;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea!"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World..!"));

        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe!!!!")); 

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
