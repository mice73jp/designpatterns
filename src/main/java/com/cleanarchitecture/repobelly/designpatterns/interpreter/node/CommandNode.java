package com.cleanarchitecture.repobelly.designpatterns.interpreter.node;

import com.cleanarchitecture.repobelly.designpatterns.interpreter.context.Context;
import com.cleanarchitecture.repobelly.designpatterns.interpreter.context.ParseException;

public class CommandNode extends Node {
    private Node node;

    @Override
    public void parse(Context context) throws ParseException {
        if ( context.currentToken().equals("repeat") ) {
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }

    public String toString() {
        return node.toString();
    }
}
