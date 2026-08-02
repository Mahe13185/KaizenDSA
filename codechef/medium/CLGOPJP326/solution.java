import java.util.Scanner;

class Book {
    int code;
    String title;
    
    double price;

    // Constructor to initialize
    public Book(int code, String title, double price) {
        this.code = code;
        this.title = title;
        this.price = price;
    }

    // Display method
    public void display() {
        System.out.println("Code: " + code);
        System.out.println("Title: " + title);
        System.out.printf("Price: %.2f\n" , price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        String title = sc.next();
        double price = sc.nextDouble();

        Book book = new Book(code,title,price);
        
        book.display();
        
    }
}
