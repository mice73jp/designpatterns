package com.cleanarchitecture.repobelly.designpatterns.singleton;

public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("인스턴스를 생성하였습니다.");
    }

    public static synchronized Singleton getInstance() {
        return instance;
    }
}
