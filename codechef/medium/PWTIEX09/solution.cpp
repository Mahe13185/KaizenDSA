class Book {
    String title;
    String author;

    // Method to display book information
    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    public static void main(String[] args) {
        
        // Create a Book object and assign title and author
        Book book = new Book();
        book.title = "King Lear";
        book.author = "William Shakespeare";
        // Call the displayInfo function to print book details
        book.display();

    }
}
