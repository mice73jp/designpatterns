package com.cleanarchitecture.repobelly.designpatternsthread.threadoverview.extendsthread;

public class RunPrintThread {
    public static void main(String[] args) {
        // Thread t1 = new PrintThread("Nice!!!");
        // t1.start();
        // Thread t2 = new PrintThread("Good!!!");
        // t2.start();

        new PrintThread("Nice!!!").start();
        new PrintThread("Good!!!").start();
    }
}
