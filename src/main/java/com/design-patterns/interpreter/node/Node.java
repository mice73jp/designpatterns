package com.cleanarchitect.interpreter.node;

import com.cleanarchitect.interpreter.context.Context;
import com.cleanarchitect.interpreter.context.ParseException;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
