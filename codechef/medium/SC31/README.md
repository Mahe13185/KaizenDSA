# SC31

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Weapon Value

A competition with $N$ participants (numbered $1$ through $N$) is taking place in Chefland. There are $N-1$ rounds in the competition; in each round, two arbitrarily chosen contestants battle, one of them loses and drops out of the competition.

There are $10$ types of weapons (numbered $1$ through $10$). You are given $N$ strings $S_1, S_2, \ldots, S_N$; for each valid $i$ and $j$, the $j$-th character of $S_i$ is '1' if the $i$-th contestant initially has a weapon of type $j$ or '0' otherwise. During each battle, for each type $j$ such that both contestants in this battle currently have weapons of type $j$, these weapons of both contestants are destroyed; after the battle, the winner collects all remaining (not destroyed) weapons of the loser. Note that each contestant may win or lose regardless of the weapons he/she has.

Chef is feeling bored watching the contest, so he wants to find the maximum possible number of weapons the winner of the tournament could have after the last battle, regardless of which contestants fight in which battles or the results of the battles. Can you help him?

### Input
- The first line of the input contains a single integer $T$ denoting the number of test cases. The description of $T$ test cases follows.
- The first line of each test case contains a single integer $N$.
- $N$ lines follow. For each valid $i$, the $i$-th of these lines contains a single string $S_i$.
### Output

For each test case, print a single line containing one integer ― the maximum number of weapons the winner could have.

### Constraints
- $1 \le T \le 10$
- $1 \le N \le 10^5$
- $|S_i| = 10$ for each valid $i$
### Subtasks

 **Subtask #1 (30 points):**  $1 \le N \le 10$

 **Subtask #2 (70 points):**  original constraints

### Sample 1:
Input
Output

```
1
3
1110001101
1010101011
0000000011
```

```
4
```

### Explanation:

 **Example case 1:**  If the first person defeats the second person, weapons $1$, $3$, $7$ and $10$ are destroyed. Then, if the third person defeats the first person (who now has weapons $2$, $5$, $8$ and $9$), weapons $9$ are destroyed and the winner has weapons $2$, $5$, $8$ and $10$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T15:09:32.931Z  

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
	        int xor_val = 0;
	        for(int i =0;i<n;i++){
	            int no = Integer.parseInt(sc.next() , 2);
	            xor_val = xor_val ^ no;
	        }
	        System.out.println(Integer.bitCount(xor_val));
	        
	    }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SC31)