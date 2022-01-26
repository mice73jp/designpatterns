package com.cleanarchitecture.repobelly.designpatterns.adaptor.bannerinherit.impl;

public class Banner {
    private String string = "";

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParan() {
        System.out.println("(" + this.string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + this.string + "*");
    }
}
