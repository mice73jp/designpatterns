package com.cleanarchitecture.repobelly.designpatterns.decorate.ornament;

import com.cleanarchitecture.repobelly.designpatterns.decorate.foundation.Display;

public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
    
}
