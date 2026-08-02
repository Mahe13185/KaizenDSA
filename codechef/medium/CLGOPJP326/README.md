# CLGOPJP326

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Book Details with Constructors

Write a Java program that implements a `Book` class to store and display book information using constructors.

You must define a class `Book` that stores  **Book code (`integer`)**,  **Book title (`string`)**,  **Book price (`double`)**.

 **You Must Use:** 

- A class named Book
- Three data members: code, title, and price
- A constructor to initialize these values
- A method display() to print the details in the specified format
### Input Format
- A single line containing an integer for book code, a string for book title (without space), a double for book price.
### Output Format
- Print Book Code, Book Title, Book Price in separate lines
### Constraints
- $1000 \leq code \leq 9999$
- $0.0 \leq price \leq 10000.0$
- Title will be a single word, max 100 characters
### Sample 1:
Input
Output

```
1234 JavaProgramming 599.99
```

```
Code: 1234
Title: JavaProgramming
Price: 599.99
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-02T15:08:10.781Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP326)