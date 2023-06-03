package design.libraryManagementSystem.tester;

import design.libraryManagementSystem.auth.UserAuthenticator;
import design.libraryManagementSystem.book.BookCopy;
import design.libraryManagementSystem.book.BookDetails;
import design.libraryManagementSystem.id.IDGenerator;
import design.libraryManagementSystem.lib.Library;
import design.libraryManagementSystem.member.Member;
import design.libraryManagementSystem.searcher.BookSearcher;
import design.libraryManagementSystem.searcher.MemberSearcher;
import design.libraryManagementSystem.searcher.impl.*;

import java.time.LocalDateTime;
import java.util.List;

public class LibraryTester {

    private Library library;

    /** First let's note down all the methods that we have to create **/

    /** Always validate the parameters **/
    /** Even this new keyword can be avoided -> Future Lectures **/
    public List<BookCopy> searchByBookName(String bookName) {
        if(bookName == null) {
            throw new IllegalArgumentException("Book name cannot be null");
        }
        BookSearcher bookSearcher = new NameBasedBookSearcher(bookName);
        return bookSearcher.search();
    }

    public List<BookCopy> searchBooksByAuthorNames(List<String> authorNames) {
        if(authorNames == null || authorNames.size() == 0) {
            throw new IllegalArgumentException("Author names cannot be null/empty");
        }
        BookSearcher bookSearcher = new AuthorBasedBookSearcher(authorNames);
        return bookSearcher.search();
    }

    public List<Member> searchMembersByMemberName(String memberName, String adminToken) throws IllegalAccessException {
        // Do Authentication & Authorization
        if(!UserAuthenticator.isAdmin(adminToken)) {
            throw new IllegalAccessException("Authorization failed");
        }
        if(memberName == null) {
            throw new IllegalArgumentException("Member name cannot be null");
        }
        MemberSearcher memberSearcher = new NameBasedMemberSearcher(memberName);
        return memberSearcher.search();
    }

    public void addBook(String bookName, List<String> authors, LocalDateTime publicationDate, String adminToken) throws IllegalAccessException {
        if(!UserAuthenticator.isAdmin(adminToken)) {
            throw new IllegalAccessException("Authorization failed");
        }
        /**
         * Validation based logic here, bookName, author etc
         */
        BookCopy bookCopy = new BookCopy(new BookDetails(bookName, publicationDate, authors), IDGenerator.getUniqueId());
        library.addBookCopy(bookCopy);
    }

    public void deleteBook(int bookCopyId, String adminToken) throws IllegalAccessException {
        if(!UserAuthenticator.isAdmin(adminToken)) {
            throw new IllegalAccessException("Authorization failed");
        }
        if(bookCopyId <= 0) {
            throw new IllegalArgumentException("BookCopyId is not valid");
        }
        BookSearcher bookSearcher = new BookIDBasedSearcher(bookCopyId);
        List<BookCopy> bookCopies = bookSearcher.search();
        if(bookCopies == null || bookCopies.size() == 0) {
            throw new RuntimeException("No book retrieved for id");
        }
        library.removeBookCopy(bookCopies.get(0));
    }

    public void blockMember(int memberId, String adminToken) throws IllegalAccessException {
        if(!UserAuthenticator.isAdmin(adminToken)) {
            throw new IllegalAccessException("Authorization failed");
        }
        if(memberId <= 0) {
            throw new IllegalArgumentException("MemberId is not valid");
        }
        MemberSearcher memberSearcher = new MemberIdBasedSearcher(memberId);
        List<Member> members = memberSearcher.search();
        if(members == null || members.size() == 0) {
            throw new RuntimeException("No member retrieved for id");
        }
        library.blockMember(members.get(0));
    }

    public void issueBook(int bookCopyId, int memberId, String adminToken) {
        // Token and Params Validation
        BookSearcher bookSearcher = new BookIDBasedSearcher(bookCopyId);
        MemberSearcher memberSearcher = new MemberIdBasedSearcher(memberId);
        // Validate search results
        library.issueBookCopy(bookSearcher.search().get(0), memberSearcher.search().get(0));
    }

    public void submitBook(int bookCopyId, int memberId, String adminToken) {

    }

    public Member getBorrowerOfBook(int bookCopyId, String adminToken) {
        return null;
    }

    public List<BookCopy> getBooksBorrowedByMember(int memberId, String adminToken) {
        return null;
    }

}
