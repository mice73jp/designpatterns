package com.cleanarchitect.interpreter.node;

import com.cleanarchitect.interpreter.context.ParseException;
import com.cleanarchitect.interpreter.context.Context;

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
