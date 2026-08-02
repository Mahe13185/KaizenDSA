# CLGOPJP326

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-02T14:57:27.146Z  

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

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP326)