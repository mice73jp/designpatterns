package com.cleanarchitecture.repobelly.designpatternsthread.threadoverview.implementsrunnable;

public class Printer implements Runnable{
    private String msg;

    public Printer(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 10000; i++) {
            System.out.print(this.msg);
        }
    }
}
