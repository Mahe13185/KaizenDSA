# PWTIEX09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Create a Book Library System

In this practice problem, you will create a Book Library System where we define a Book class with attributes like title and author. Finally, you will display all the books in the library.

### Expected output

```
Title: King Lear, Author: William Shakespeare

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-02T15:57:07.126Z  

```cpp
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

```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX09)