package com.cleanarchitect.decorate.ornament;

import com.cleanarchitect.decorate.foundation.Display;

public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
    
}
