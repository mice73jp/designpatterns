package com.cleanarchitect.proxy.print;

public class Printer implements Printable{
    private String name;

    public Printer() {
        this.heavyJob("Printer의 인스턴스를 생성중!!");
    }

    public Printer(String name) {
        this.name = name;
        this.heavyJob("Printer의 인스턴스(" + this.name + ")를 생성중!!");
    }

    @Override
    public String getPrintName() {
        return this.name;
    }

    @Override
    public void print(String string) {
        System.out.println("==== " + this.name + " ====");
        System.out.println(string);
    }

    @Override
    public void setPrintName(String name) {
        this.name = name;      
    }
    
    private void heavyJob(String msg) {
        System.out.println(msg);
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {

            }
        }
        System.out.println("완료!");
    }
}
