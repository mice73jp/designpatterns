package com.cleanarchitecture.repobelly.designpatterns.interpreter.node;

import com.cleanarchitecture.repobelly.designpatterns.interpreter.context.Context;
import com.cleanarchitecture.repobelly.designpatterns.interpreter.context.ParseException;

public class ProgramNode extends Node{
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[program " + commandListNode + "]";
    }
    
}
