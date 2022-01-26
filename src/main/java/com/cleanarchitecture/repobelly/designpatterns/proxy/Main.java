package com.cleanarchitecture.repobelly.designpatterns.proxy;

import com.cleanarchitecture.repobelly.designpatterns.proxy.print.Printable;
import com.cleanarchitecture.repobelly.designpatterns.proxy.print.PrinterProxy;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("이름은 현재 " + p.getPrintName() + "입니다.");
        p.setPrintName("Bob");
        System.out.println("이름은 현재 " + p.getPrintName() + "입니다.");
        p.print("Hello World!!");
    }
}
