package com.cleanarchitecture.repobelly.designpatterns.command.command;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command{
    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        Iterator<Command> it = this.commands.iterator();
        while(it.hasNext()) {
            (it.next()).execute();
            try {
                Thread.sleep(500);
            } catch ( InterruptedException e) {
                
            }
        }
    }
    
    public void append(Command cmd) {
        if ( cmd != null) {
            this.commands.push(cmd);
        }
    }

    public void undo() {
        if ( !this.commands.empty() ) {
            this.commands.pop();
        }
    }

    public void clear() {
        this.commands.clear();
    }
}
