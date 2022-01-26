package com.cleanarchitect.iterator.bookshelf.impl;

import com.cleanarchitect.iterator.bookshelf.Iterator;

public class BookShelfIterator implements Iterator{
    private BookShelf bookshelf;
    private int index;

    public BookShelfIterator(BookShelf bookshelf) {
        this.bookshelf = bookshelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.bookshelf.getLength();
    }

    @Override
    public Object next() {
        return this.bookshelf.getBookAt(index++);
    }
}
