package design.libraryManagementSystem.searcher.impl;

import design.libraryManagementSystem.book.BookCopy;
import design.libraryManagementSystem.searcher.BookSearcher;

import java.util.List;

public class NameBasedBookSearcher implements BookSearcher {
    private String bookName;

    public NameBasedBookSearcher(String bookName) {
        this.bookName = bookName;
    }


    @Override
    public List<BookCopy> search() {
        return null;
    }
}
