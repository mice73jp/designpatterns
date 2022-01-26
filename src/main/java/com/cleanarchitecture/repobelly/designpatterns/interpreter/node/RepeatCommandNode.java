package com.cleanarchitecture.repobelly.designpatterns.interpreter.node;

import com.cleanarchitecture.repobelly.designpatterns.interpreter.context.Context;
import com.cleanarchitecture.repobelly.designpatterns.interpreter.context.ParseException;

public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        this.number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "repeat " + this.number + " " + commandListNode + "]";
    }
    
}
