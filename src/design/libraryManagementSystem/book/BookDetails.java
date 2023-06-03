package design.libraryManagementSystem.book;

import java.time.LocalDateTime;
import java.util.List;

public class BookDetails {
    private final String bookName;
    private final LocalDateTime publicationDate;
    private final List<String> authors;

    public BookDetails(String bookName, LocalDateTime publicationDate, List<String> authors) {
        this.bookName = bookName;
        this.publicationDate = publicationDate;
        this.authors = authors;
    }
}
