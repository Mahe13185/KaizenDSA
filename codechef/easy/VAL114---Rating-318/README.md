# VAL114 - Rating 318

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Valentines Contest

Chef knows that a starters will be organised on next Wednesday, i.e., Valentine's day.

Since it is Starters $120$ today, starters $121$ is likely to be organised on Valentine's day.
Given an integer $N$, find whether starters $N$ is likely to be organised on Valentine's day.

### Input Format
- The input will contain a single integer $N$.
### Output Format

Output `Likely` if starters $N$ is likely to be organised on Valentine's day. Otherwise, output `Unlikely`.

You may print each character of the string in uppercase or lowercase (for example, the strings `LIKELY`, `likely`, `Likely`, and `lIkElY` will all be treated as identical).

### Constraints
- $120 \leq N \leq 123$.
### Sample 1:
Input
Output

```
121
```

```
Likely
```

### Explanation:

Starters $121$ is likely on Valentine's day.

### Sample 2:
Input
Output

```
120
```

```
Unlikely
```

### Explanation:

Starters $120$ is unlikely on Valentine's day.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-02T15:54:50.675Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int x = sc.nextInt();
	    System.out.println( (x == 121) ? "Likely" : "Unlikely");
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/VAL114)