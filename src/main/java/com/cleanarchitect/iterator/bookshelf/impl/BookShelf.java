package com.cleanarchitect.iterator.bookshelf.impl;

import java.util.ArrayList;
import java.util.List;

import com.cleanarchitect.iterator.bookshelf.Aggregate;
import com.cleanarchitect.iterator.bookshelf.Iterator;
import com.cleanarchitect.iterator.bookshelf.IteratorBF;

public class BookShelf implements Aggregate {
    private List<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return this.books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return this.books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    @Override
    public IteratorBF iteratorBF() {
        return new BookShelfIteratorBF(this);
    }

}

/**
 * 
 * BookShelf with array
 * 
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

}
*/
