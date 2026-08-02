# CHRISTGREET - Rating 205

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Christmas Greetings

Christmas is celebrated on $25^{th}$ December every year.

You are given a day $X$ in December. Determine whether it is Christmas.
Print `CHRISTMAS` if it is Christmas. Otherwise print `ORDINARY`.

### Input Format
- The input consists of a single integer $X$, denoting a day in December.
### Output Format

Output on a new line `CHRISTMAS`, if it is Christmas and `ORDINARY` otherwise.

You may print each character in uppercase or lowercase. For example the strings `CHRISTMAS`, `christmas`, `Christmas` are all considered identical.

### Constraints
- $1 \leq X \leq 31$
### Sample 1:
Input
Output

```
25
```

```
CHRISTMAS
```

### Explanation:

We print `CHRISTMAS` since day is $25$.

### Sample 2:
Input
Output

```
12
```

```
ORDINARY
```

### Explanation:

We print `ORDINARY` since day is not $25$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-02T15:48:32.811Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    System.out.println( (x==25) ? "CHRISTMAS" : "ORDINARY");
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHRISTGREET)