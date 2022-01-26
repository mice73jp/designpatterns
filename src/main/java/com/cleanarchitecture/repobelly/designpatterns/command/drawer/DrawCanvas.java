package com.cleanarchitecture.repobelly.designpatterns.command.drawer;

import java.awt.*;

import com.cleanarchitecture.repobelly.designpatterns.command.command.MacroCommand;

public class DrawCanvas extends Canvas implements Drawable {
    private Color color = Color.RED;
    private int radis = 6;
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.WHITE);
        this.history = history;
    }

    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(this.color);
        g.fillOval(x - this.radis, y  - this.radis, this.radis * 2, this.radis * 2 );
    }
}
