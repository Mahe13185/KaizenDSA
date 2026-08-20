# DUPLETP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Dull Operation

On Halloween, Chef is in a somber mood.
Chef has an  **odd**  integer $N$ that he has to decode.
To do so, Chef would like to find a pair of integers $x$ and $y$ ($0 \leq x, y \lt 2^{30}$) such that:

$$ (x\mid y) \cdot (x\oplus y) = N $$

Help Chef find  **any**  such pair!
It can be proved that a valid pair always exists.

Here, $\mid$ represents the bitwise OR operation, and $\oplus$ represents the bitwise XOR operation.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first and only line of each test case contains a single odd integer $N$.
### Output Format

For each test case, output on a new line two space-separated integers $x$ and $y$ such that $0 \leq x, y \lt 2^{30}$, and

$$ (x\mid y) \cdot (x\oplus y) = N $$

If multiple solutions exist, you may print  **any of them**.
It can be proved that a solution always exists under the given constraints.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N \leq 10^9$
- $N$ is odd.
### Sample 1:
Input
Output

```
4
1
49
21
35

```

```
1 0
3 4
7 4
7 2
```

### Explanation:

 **Test case $1$:**  We have $N = 1$. Choose $x = 1$ and $y = 0$, which gives us $(x\mid y) = 1$ and $(x\oplus y) = 1$.
$1\cdot 1 = 1$, so this is a valid solution.

 **Test case $2$:**  We have $N = 49$. Choose $x = 3$ and $y = 4$, which gives us $(x\mid y) = 7$ and $(x\oplus y) = 7$.
$7\cdot 7 = 49$, so this is a valid solution.

 **Test case $3$:**  Here, $N = 21$. Choose $x = 7$ and $y = 4$, which gives us $(x\mid y) = 7$ and $(x\oplus y) = 3$.
$7\cdot 3 = 21$, so this is a valid solution.

 **Test case $4$:**  Here, $N = 35$. Choose $x = 7$ and $y = 2$, which gives us $(x\mid y) = 7$ and $(x\oplus y) = 5$.
$7\cdot 5 = 35$, so this is a valid solution.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T15:08:01.445Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for (int i =0; i< t ;i++ ){
	        int n = sc.nextInt();
	        System.out.println(n + " " + (n-1));
	    } 
	    
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DUPLETP)