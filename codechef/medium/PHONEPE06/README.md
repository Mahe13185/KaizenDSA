# PHONEPE06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Search in Rotated Sorted Array

You are given a sorted array that has been rotated to the right by some number of steps. Your task is to find the index of a given element in this array.

For example, if a sorted array [1,2,3,4,5] is rotated by 2 positions, it becomes [4,5,1,2,3]. Despite being rotated, the array maintains some order that can be used to search efficiently.

### Input Format
- First line contains $T$ - the number of test cases
- For each test case: First line contains two space-separated integers $N$ and $K$ - size of array and element to find Second line contains $N$ space-separated integers $A_1, A_2,..., A_N$ - the rotated array elements
### Output Format
- For each test case, print a single integer - the index of $K$ in the array (0-based indexing), or -1 if $K$ is not found
### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 5000$
- $0 \leq K \leq 10^5$
- $0 \leq A_i \leq 10^5$
### Sample 1:
Input
Output

```
4
5 2
12 15 18 2 4
4 3
3 4 1 2
6 6
6 7 1 2 3 4
5 5
1 2 3 4 5
```

```
3
0
0
4
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T14:36:54.350Z  

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
		    int target = sc.nextInt();
		    for (int i=0;i<n ;i++ ){
		        if(target == sc.nextInt()) System.out.println(i);
		    } 
		    
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PHONEPE06)