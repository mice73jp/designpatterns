package com.cleanarchitecture.repobelly.designpatterns.decorate;

import com.cleanarchitecture.repobelly.designpatterns.decorate.foundation.Display;
import com.cleanarchitecture.repobelly.designpatterns.decorate.foundation.StringDisplay;
import com.cleanarchitecture.repobelly.designpatterns.decorate.ornament.FullBorder;
import com.cleanarchitecture.repobelly.designpatterns.decorate.ornament.SideBorder;

public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello World!");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();

        Display d4 = 
            new SideBorder(
                new FullBorder(
                    new FullBorder(
                        new SideBorder(
                            new FullBorder(
                                new StringDisplay("안녕하세요!")
                            )
                        , '*')
                    )
                )
            , '/');
        d4.show();
    }
}
