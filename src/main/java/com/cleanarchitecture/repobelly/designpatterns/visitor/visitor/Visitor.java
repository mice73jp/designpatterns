package com.cleanarchitecture.repobelly.designpatterns.visitor.visitor;

import com.cleanarchitecture.repobelly.designpatterns.visitor.datastructure.Directory;
import com.cleanarchitecture.repobelly.designpatterns.visitor.datastructure.File;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
