package accessModifiers;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Maths", 100, 30, false);
        System.out.println(book.noOfPages); // public -> works
        // System.out.println(book.isRuled); // private -> java: isRuled has private access in accessModifiers.Book
        System.out.println(book.cost); // protected -> works
        System.out.println(book.subject); // default -> works
    }
}
