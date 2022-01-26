package com.cleanarchitecture.repobelly.designpatterns.command.drawer;

import java.awt.Point;

import com.cleanarchitecture.repobelly.designpatterns.command.command.Command;

public class DrawCommand implements Command{
    protected Drawable drawable;
    private Point position;
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    @Override
    public void execute() {
        drawable.draw(this.position.x, this.position.y);
    }    
}
