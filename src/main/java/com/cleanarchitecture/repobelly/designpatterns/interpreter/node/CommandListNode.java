package com.cleanarchitecture.repobelly.designpatterns.interpreter.node;

import java.util.ArrayList;
import java.util.List;

import com.cleanarchitecture.repobelly.designpatterns.interpreter.context.Context;
import com.cleanarchitecture.repobelly.designpatterns.interpreter.context.ParseException;

public class CommandListNode extends Node{
    private List<Node> list = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {
        while(true) {
            if ( context.currentToken() == null ) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }
    
    public String toString() {
        return "" + list;
    }
}
