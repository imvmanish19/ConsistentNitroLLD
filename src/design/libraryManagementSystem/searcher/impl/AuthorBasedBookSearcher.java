package design.libraryManagementSystem.searcher.impl;

import design.libraryManagementSystem.book.BookCopy;
import design.libraryManagementSystem.searcher.BookSearcher;

import java.util.List;

public class AuthorBasedBookSearcher implements BookSearcher {
    List<String> authors;

    public AuthorBasedBookSearcher(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public List<BookCopy> search() {
        return null;
    }
}
