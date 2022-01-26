package com.cleanarchitect.iterator.bookshelf.impl;

import com.cleanarchitect.iterator.bookshelf.IteratorBF;

public class BookShelfIteratorBF implements IteratorBF{
    private BookShelf bookshelf;
    private int index;

    public BookShelfIteratorBF(BookShelf bookshelf) {
        this.bookshelf = bookshelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (this.index < 0) {
            this.index = 0;
        }
        return this.index < this.bookshelf.getLength();
    }

    @Override
    public Object next() {
        return this.bookshelf.getBookAt(index++);
    }

    @Override
    public boolean hasPrev() {
        if (this.index >= this.bookshelf.getLength()) {
            this.index = this.bookshelf.getLength() - 1;
        }

        return this.index >= 0;
    }

    @Override
    public Object prev() {
        return this.bookshelf.getBookAt(index--);
    }
}
