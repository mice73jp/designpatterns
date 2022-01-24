package com.cleanarchitect.proxy;

import com.cleanarchitect.proxy.print.Printable;
import com.cleanarchitect.proxy.print.PrinterProxy;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("이름은 현재 " + p.getPrintName() + "입니다.");
        p.setPrintName("Bob");
        System.out.println("이름은 현재 " + p.getPrintName() + "입니다.");
        p.print("Hello World!!");
    }
}
