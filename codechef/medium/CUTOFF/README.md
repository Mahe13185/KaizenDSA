# CUTOFF

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### 400M Race

Listen

Alice, Bob, and Charlie participated in a $400$-metre race.
The time taken by Alice, Bob, and Charlie to complete the race was $X, Y,$ and $Z$ seconds respectively. Note that $X, Y,$ and $Z$ are  **distinct**.

Determine the person having the highest average speed in the race.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line of each test case contains three space-separated integers $X, Y,$ and $Z$ — the time taken by Alice, Bob, and Charlie to complete the race.
### Output Format

For each test case, output on a new line:

- ALICE, if Alice had the highest average speed.
- BOB, if Bob had the highest average speed.
- CHARLIE, if Charlie had the highest average speed.

Note that you may print each character in uppercase or lowercase. For example, the strings `BOB`, `bob`, `Bob`, and `BoB` are all considered identical.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq X, Y, Z \leq 100$
- $X, Y,$ and $Z$ are distinct.
### Sample 1:
Input
Output

```
3
1 2 8
4 100 1
7 3 5

```

```
ALICE
CHARLIE
BOB

```

### Explanation:

 **Test case $1$:**  The time taken by the three participants to complete a $400$ metre race was $1, 2,$ and $8$ respectively. Thus, their respective speeds were $\frac{400}{1} = 400, \frac{400}{2} = 200,$ and $\frac{400}{8} = 50$ metres per second respectively.

Thus, Alice has the maximum speed.

 **Test case $2$:**  The time taken by the three participants to complete a $400$ metre race was $4, 100,$ and $1$ respectively. Thus, their respective speeds were $\frac{400}{4} = 100, \frac{400}{100} = 4,$ and $\frac{400}{1} = 400$ metres per second respectively.

Thus, Charlie has the maximum speed.

 **Test case $3$:**  Since Bob takes the minimum time to complete the race, he has the maximum average speed.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T11:21:46.966Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            
            if(x < y && x < z) System.out.println("Alice");
            else if(y < x && y < z) System.out.println("Bob");
            else System.out.println("Charlie");
            
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CUTOFF)