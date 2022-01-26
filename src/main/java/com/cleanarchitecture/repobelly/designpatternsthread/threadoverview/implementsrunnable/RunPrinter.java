package com.cleanarchitecture.repobelly.designpatternsthread.threadoverview.implementsrunnable;

public class RunPrinter {
    public static void main(String[] args) {
        new Thread(new Printer("Good!!")).start();
        new Thread(new Printer("Nice!!")).start();
    }
}
