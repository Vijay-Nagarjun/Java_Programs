package problems;
class LibraryItem {
    String title;

    // Constructor
    LibraryItem(String title) {
        this.title = title;
    }

    // Method to display title
    void displayInfo() {
        System.out.println("Title: " + title);
    }
}

// Subclass
class Book extends LibraryItem {
    String author;

    // Constructor
    Book(String title, String author) {
        super(title); // Call parent constructor
        this.author = author;
    }

    // Override method
    @Override
    void displayInfo() {
        super.displayInfo(); // Call parent's displayInfo
        System.out.println("Author: " + author);
    }
}

public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("Java Basics", "James Gosling");
        book.displayInfo();
	}

}
