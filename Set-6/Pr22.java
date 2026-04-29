
class BookNotAvailableException extends Exception {
    BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    private int availableBooks;

    Library(int books) {
        this.availableBooks = books;
        System.out.println("Library initialized with " + books + " books.");
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully. Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class Pr22 {
    public static void main(String[] args) {
        Library lib = new Library(3);

        try {
            System.out.println("\nTrying to issue 2 books...");
            lib.issueBook(2);
        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            System.out.println("\nTrying to issue 2 more books...");
            lib.issueBook(2);
        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}