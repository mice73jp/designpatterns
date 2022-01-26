package com.cleanarchitect.decorate.ornament;

import com.cleanarchitect.decorate.foundation.Display;

public class SideBorder extends Border{
    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public String getRowText(int row) {
        return this.borderChar + display.getRowText(row) + this.borderChar;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }
}
