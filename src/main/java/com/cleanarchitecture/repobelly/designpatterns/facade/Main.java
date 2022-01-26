package com.cleanarchitecture.repobelly.designpatterns.facade;

import com.cleanarchitecture.repobelly.designpatterns.facade.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("a1@youngjin.com", "welcome.html");
    }
}
