package com.cleanarchitecture.repobelly.designpatterns.interpreter.node;

import com.cleanarchitecture.repobelly.designpatterns.interpreter.context.Context;
import com.cleanarchitecture.repobelly.designpatterns.interpreter.context.ParseException;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
