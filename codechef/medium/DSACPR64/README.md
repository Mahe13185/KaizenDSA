# DSACPR64

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Miscellaneous Linear Search

Given  **n**  pairs of integers, write a program to check if there exists any pair that contains both integers  **a**  and  **b**  in any order.

### Input Format
- The first line contains an integer $n$, the number of pairs.
- The next $n$ lines each contain two space-separated integers representing a pair.
- The last line contains two integers $a$ and $b$.
### Output Format
- Print "Yes" if there exists any pair that contains both integers a and b in any order.
- Print "No" if no such pair exists.
### Sample 1:
Input
Output

```
4
2 3
4 5
3 5
1 7
5 3
```

```
Yes
```

### Sample 2:
Input
Output

```
4
2 3
4 5
3 5
1 7
5 9
```

```
No
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-30T09:52:11.156Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[][] arr = new int[n][2];
	    
	    for(int i=0;i<n;i++){
	        arr[i][0] = sc.nextInt();
	        arr[i][1] = sc.nextInt();
	    }
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    boolean found = false;
	    for(int i=0;i<n;i++){
	    int x = arr[i][0];
	    int y = arr[i][1];
	    
	    if((a == x || a == y) && (b == x || b == y)){
	        found = true;
	        break;
	    }
	    }
	    System.out.println( (found) ? "Yes" : "No");
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSACPR64)