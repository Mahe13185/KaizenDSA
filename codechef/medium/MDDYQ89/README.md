# MDDYQ89

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Factorial
### Task

Given an integer $N$, calculate and output the factorial of a $N$.

 **Factorial**  of an integer $N$ is the product of first $N$ natural numbers.

Recursive equation for Factorial:
$Factorial(n) = N * Factorial(n-1)$, $Factorial(0) = 1$, $Factorial(1) = 1$

### Input Format
- Input contains a single integer $N$
### Output Format

Output the Factorial of $N$

### Constraints
- $1 \leq N \leq 10$
### Sample 1:
Input
Output

```
5
```

```
120
```

### Explanation:

$1 \times 2 \times 3 \times 4 \times 5 = 120$

### Sample 2:
Input
Output

```
0
```

```
1
```

### Explanation:

Factorial of $0$ is $1$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-15T17:28:12.671Z  

```java
import java.util.Scanner;

public class Main {
    static int Factorial(int n) {
        if(n==0) return 1;
        
        return n * Factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Factorial(n));
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MDDYQ89)