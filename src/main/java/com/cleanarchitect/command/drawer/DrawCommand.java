package com.cleanarchitect.command.drawer;

import com.cleanarchitect.command.command.Command;
import java.awt.Point;

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
