# MONKCI30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sort a list of programming languages

You are given the task to build a program that takes a list of programming languages from the user and sorts them in alphabetical order.

 **Tasks:** 

- Take an integer input n — the number of programming languages
- Take n strings as input from the user, each representing a programming language
- Store them in an ArrayList
- Sort the ArrayList using Collections.sort()
- Print the first element (i.e., the language that comes first alphabetically)
- Print the last element (i.e., the language that comes last alphabetically)
### Sample 1:
Input
Output

```
5
Java
Python
C++
Ruby
Go

```

```
First Language: C++
Last Language: Ruby

```

### Sample 2:
Input
Output

```
6
Rust
Kotlin
Swift
JavaScript
C
TypeScript

```

```
First Language: C  
Last Language: TypeScript

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-02T14:57:20.067Z  

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of languages
        int n = sc.nextInt();
        sc.nextLine();
        // Step 2: Create ArrayList to store language names
        ArrayList<String> arr = new ArrayList<>();
        // Step 3: Read n languages from user
        
        for(int i=0;i<n;i++){
            arr.add(sc.nextLine());
        }
        // Step 4: Sort the list
        Collections.sort(arr);
        // Step 5: Print first and last elements
        System.out.println("First Language:" + arr.get(0));
        System.out.println("Last Language:" + arr.get(n-1));

        
        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI30)