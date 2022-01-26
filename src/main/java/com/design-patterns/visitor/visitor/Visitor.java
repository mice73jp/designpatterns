package com.cleanarchitect.visitor.visitor;

import com.cleanarchitect.visitor.datastructure.Directory;
import com.cleanarchitect.visitor.datastructure.File;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
