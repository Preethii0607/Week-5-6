class BookInventory {
    String title;
    String author;
    int copiesAvailable;

    // Constructor that sets all three fields[cite: 5]
    public BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    // Instance method that prints one formatted line[cite: 5]
    public void printEntry() {
        System.out.println(title + " by " + author + " " + copiesAvailable + " copies available");
    }
}

public class LibraryInventoryTest {
    public static void main(String[] args) {
        // Create four BookInventory objects and store them in an array[cite: 5]
        BookInventory[] books = {
            new BookInventory("Clean Code", "Robert C. Martin", 3),
            new BookInventory("Effective Java", "Joshua Bloch", 5),
            new BookInventory("Refactoring", "Martin Fowler", 0),
            new BookInventory("Design Patterns", "GoF", 2)
        };

        // Print each one in a loop[cite: 5]
        for (BookInventory book : books) {
            book.printEntry();
        }
    }
}