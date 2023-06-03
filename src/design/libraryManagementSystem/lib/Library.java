package design.libraryManagementSystem.lib;

import design.libraryManagementSystem.book.BookCopy;
import design.libraryManagementSystem.dao.DBAccessor;
import design.libraryManagementSystem.member.Member;

import java.util.List;

public class Library {

    private final DBAccessor dbAccessor;

    public Library(DBAccessor dbAccessor) {
        this.dbAccessor = dbAccessor;
    }

    public void addBookCopy(BookCopy bookCopy) {
        if(bookCopy == null) {
            // ..
        }
        dbAccessor.insertBookCopy(bookCopy);
    }

    public void removeBookCopy(BookCopy bookCopy) {
        // Check if bookCopy is available
        // Deletion
        // Synchronize the threads (Locking)
        // Handle Edge Cases like this
        if(dbAccessor.isCopyAvailable(bookCopy)) {
            dbAccessor.deleteBookCopy(bookCopy);
        }
    }

    public void blockMember(Member member) {

    }

    public void issueBookCopy(BookCopy bookCopy, Member member) {

    }

    public void submitBookCopy(BookCopy bookCopy, Member member) {

    }

    public Member getBorrower(BookCopy bookCopy) {
        return null;
    }

    public List<BookCopy> getBooksBorrowedByMember(Member member) {
        return null;
    }

}
