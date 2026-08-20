# FIZZBUZZ2304

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Playing with OR

You are given an array $A$ containing $N$ integers, and an integer $K$ ($1 \leq K \leq N$).
Find the number of  *subarrays*  of $A$ with length $K$ whose bitwise OR is odd.

 **Note:**  A subarray of $A$ is a contiguous segment of elements of $A$.
For example, if $A = [1, 3, 2]$, then it has $6$ non-empty subarrays: $[1], [3], [2], [1, 3], [3, 2], [1, 3, 2]$.
In particular, $[1, 2]$ is  *not*  a subarray of $A$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains two space-separated integers $N$ and $K$ — the length of the array and the subarray size you have to check, respectively. The second line of each test contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ — the elements of the array.
### Output Format

For each test case, output on a new line the number of length-$K$ subarrays of $A$ whose bitwise OR is odd.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq K\leq N \leq 5\cdot 10^5$
- $1 \leq A_i \leq 10^9$
- The sum of $N$ across all tests doesn't exceed $5\cdot 10^5$.
### Sample 1:
Input
Output

```
2
5 2
5 7 13 4 6
4 3
2 6 7 4

```

```
3
2
```

### Explanation:

 **Test case $1$:**  There are four subarrays of length $K = 2$.

- $[5, 7]$, with bitwise OR equal to $7$.
- $[7, 13]$, with bitwise OR equal to $15$.
- $[13, 4]$, with bitwise OR equal to $13$.
- $[4, 6]$, with bitwise OR equal to $6$.

Three of them are odd, so the answer is $3$.

 **Test case $2$:**  There are two subarrays of length three, both of them have odd bitwise OR.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T15:10:49.660Z  

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
	      int k = sc.nextInt();
	      int[] arr = new int[n];
	      
	      for (int i=0;i<n ;i++ ){
	          arr[i] = sc.nextInt();
	      }
	      
	      int answer = 0;
	      int oddCount =0;
	   //   first window
	   for(int i=0;i<k;i++){
	       if((arr[i] & 1) == 1)
	           oddCount++;
	   }
	       if(oddCount > 0)
	            answer++;
	   //slide window
	   for(int right=k;right < arr.length;right++){
	       int left =  right - k;
	       if((arr[left] & 1) == 1)
	           oddCount--;
	       if((arr[right] & 1) == 1)
	            oddCount++;
	            
	       if(oddCount>0){
	           answer++;
	       }
	   }
	   System.out.println(answer);
	  }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FIZZBUZZ2304)