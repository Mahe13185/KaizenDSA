# MAKEZERO

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Make them Zero

You are given an array $A$ of length $N$.

You can perform the following operation on the array any number of times:

- Choose any subsequence $S$ of the array $A$ and a positive integer $X$ such that $X$ is a power of $2$ and subtract $X$ from all the elements of the subsequence $S$.

Find the  **minimum**  number of operations required to make all the elements of the array equal to $0$.

### Input Format
- First line will contain $T$, number of test cases. Then the test cases follow.
- First line of each test case contains an integer $N$ denoting the length of the array $A$.
- Second line contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ - denoting the elements of array $A$.
### Output Format

For each test case, output in a single line, the  **minimum**  number of moves required to make all the elements of the array $A$ equal to $0$.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N \leq 10^5$
- $0 \leq A_i \leq 10^9$
- Sum of $N$ over all test cases do not exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
4
3
2 2 2
4
2 2 2 4
2
0 0
3
1 2 3

```

```
1
2
0
2

```

### Explanation:

 **Test Case $1$:**  Take the subsequence with indices $\{1,2,3\}$ and subtract $2^1 = 2$ from each element.

 **Test Case $2$:**  Take the subsequence with indices $\{1,2,3,4\}$ and subtract $2^1 = 2$ from each element. After this operation, the array becomes $[0,0,0,2]$. Now, take the subsequence with index $\{4\}$ and subtract $2^1 = 2$ from it.

 **Test Case $3$:**  All the elements are already $0$.

 **Test Case $4$:**  Take the subsequence with indices $\{2,3\}$ and subtract $2^1=2$ from it. Now, the array becomes $[1, 0, 1]$. Now, take the subsequence with indices $\{1, 3\}$ and subtract $2^0=1$ from it.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T16:35:45.389Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int count = 0;
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for (int i=0;i<n ;i++){
		        arr[i] = sc.nextInt();
		    } 
		    
		    for (int i=0;i<30 ;i++){
		        for (int j=0;j<n ;j++ ) {
		            if ((arr[j] & (1 << i)) != 0){
		                count++;
		                break;
		            } 
		        }
		    } 
		    System.out.println(count);
		}
		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MAKEZERO)