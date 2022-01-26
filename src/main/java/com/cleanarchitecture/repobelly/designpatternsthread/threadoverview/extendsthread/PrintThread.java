package com.cleanarchitecture.repobelly.designpatternsthread.threadoverview.extendsthread;

public class PrintThread extends Thread {
    private String msg;

    public PrintThread(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 10000; i++) {
            System.out.print(this.msg);
        }
    }
    
}
