package com.cleanarchitecture.repobelly.designpatterns.builder.worker.impl;

import com.cleanarchitecture.repobelly.designpatterns.builder.worker.Builder;

public class TextBuilder extends Builder {
    private StringBuilder buffer = new StringBuilder();
    
    @Override
    public Object getResult() {
        buffer.append("==============================\n");
        return buffer.toString();
    }

    @Override
    public void makeItems(String[] items) {
        for ( int i = 0; i < items.length; i++ ) {
            buffer.append("*" + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("# " + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeTitle(String title) {
        buffer.append("==============================\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }
    
}
