package com.cleanarchitecture.repobelly.designpatterns.decorate.foundation;

public abstract class Display {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);
    public final void show() {
        for (int i = 0; i < this.getRows(); i++ ) {
            System.out.println(this.getRowText(i));
        }
    }
}
