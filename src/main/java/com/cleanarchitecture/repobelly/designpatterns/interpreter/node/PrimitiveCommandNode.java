package com.cleanarchitecture.repobelly.designpatterns.interpreter.node;

import com.cleanarchitecture.repobelly.designpatterns.interpreter.context.Context;
import com.cleanarchitecture.repobelly.designpatterns.interpreter.context.ParseException;

public class PrimitiveCommandNode extends Node{
    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        this.name = context.currentToken();
        context.skipToken(this.name);
        if ( !this.name.equals("go") && !this.name.equals("right") && !this.name.equals("left")) {
            throw new ParseException(name + " is undefined.");
        }
    }
    
    public String toString() {
        return this.name;
    }
}
