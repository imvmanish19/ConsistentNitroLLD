package design.libraryManagementSystem.searcher.impl;

import design.libraryManagementSystem.book.BookCopy;
import design.libraryManagementSystem.searcher.BookSearcher;

import java.util.List;

public class BookIDBasedSearcher implements BookSearcher {

    private int bookId;

    public BookIDBasedSearcher(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public List<BookCopy> search() {
        return null;
    }
}
