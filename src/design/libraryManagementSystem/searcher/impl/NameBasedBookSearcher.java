package design.libraryManagementSystem.searcher.impl;

import design.libraryManagementSystem.searcher.BookSearcher;

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
