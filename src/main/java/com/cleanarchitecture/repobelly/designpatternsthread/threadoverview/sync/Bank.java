package com.cleanarchitecture.repobelly.designpatternsthread.threadoverview.sync;

public class Bank {
    private int money;
    private String name;
    public Bank(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public synchronized void deposite(int m) {
        this.money += m;
    }

    public synchronized boolean withdraw(int m) {
        if ( money >= m) {
            this.money -= m;
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return this.name;
    }
}
