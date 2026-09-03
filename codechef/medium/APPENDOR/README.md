# APPENDOR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Append for OR

Chef has an array $A$ of length $N$.

Chef wants to append a  **non-negative**  integer $X$ to the array $A$ such that the bitwise OR of the entire array becomes $= Y$ i.e. $(A_1 \ | \ A_2 \ | \ \ldots \ | \ A_N \ | \ X) = Y$. (Here, $|$ denotes the bitwise OR operation)

Determine the  **minimum**  possible value of $X$. If no possible value of $X$ exists, output $-1$.

### Input Format
- The first line contains a single integer $T$ — the number of test cases. Then the test cases follow.
- The first line of each test case contains two integers $N$ and $Y$ — the size of the array $A$ and final bitwise OR of the array $A$.
- The second line of each test case contains $N$ space-separated integers $A_1, A_2, \dots, A_N$ denoting the array $A$.
### Output Format

For each test case, output the minimum possible value of $X$ for which $(A_1 \ | \ A_2 \ | \ \ldots \ | \ A_N \ | \ X) = Y$ holds.

If no such value exists, output $-1$.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq N \leq 10^5$
- $0 \le A_i \lt 2^{20}$
- $0 \le Y \lt 2^{20}$
- Sum of $N$ over all test cases does not exceed $2 \cdot 10^5$
### Sample 1:
Input
Output

```
4
4 15
3 5 6 2
3 8
1 2 1
1 1
0
5 7
1 2 4 2 1

```

```
8
-1
1
0

```

### Explanation:

 **Test Case 1:**  $(3 \ | \ 5 \ | \ 6 \ | \ 2 \ | \ X) = 15$ holds for the following values of $X$: $\{8, 9, 10, 11, 12, 13, 14, 15\}$. The minimum among them is $8$.

 **Test Case 2:**  It can be proven that no valid value of $X$ exists.

 **Test Case 3:**  $(0 \ | \ X) = 1$ holds for only $X = 1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T15:21:01.176Z  

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
	    
	    while(t-- > 0){
	        int n = sc.nextInt();
	        int y = sc.nextInt();
	        int sum = 0;
	        for(int i =0;i<n;i++){
	            sum |= sc.nextInt();
	        }
	        if((sum | y) != y){
	            System.out.println("-1");
	        }else{
	            int x = y ^ sum;
	            System.out.println(x);
	        }
	    }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/APPENDOR)