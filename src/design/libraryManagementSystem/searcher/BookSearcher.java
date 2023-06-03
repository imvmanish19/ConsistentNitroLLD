package design.libraryManagementSystem.searcher;

import design.libraryManagementSystem.book.BookCopy;

import java.util.List;

public interface BookSearcher {
    List<BookCopy> search();
}
