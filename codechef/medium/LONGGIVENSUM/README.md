# LONGGIVENSUM

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Longest subarray with a given sum

You are given an array of integers $nums$ with length $n$ and an integer $k$. Your task is to determine the length of the longest continuous sub-array whose elements sum up exactly to $k$. If there is no such sub-array, return $0$.

## Function Declaration
### Function Name

$longestSubarraySum$ – This function computes the length of the longest continuous sub-array whose sum is exactly equal to $k$.

### Parameters
- $arr$ : A vector of integers of length $n$, representing the array.
- $k$ : An integer representing the required target sum.
### Return Value
- Returns a single integer — the maximum length of any continuous sub-array whose sum equals $k$. If no such sub-array exists, the function returns $0$.

`The input and output formats given below are only if you want to test using custom inputs.`

## Constraints
- $1 \leq T \leq 10^5$
- $1 \leq n \leq 10^5$
- $-10^5 \leq arr[i] \leq 10^5$
- $-10^9 \leq k \leq 10^9$
### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line of each test case contains two space-separated integers $n$ and $k$ — the length of the array and the required sum respectively. The next line contains $n$ space-separated integers, representing the array nums.
### Output Format

For each test case, output on a new line a single integer — the  **length of the longest continuous subarray whose sum is exactly $k$**. If no such subarray exists, output  **0**.

### Sample 1:
Input
Output

```
3
6 15
10 5 2 7 1 9
3 6
-3 2 1
5 5
1 2 3 2 1
```

```
4
0
2
```

### Explanation:
- In the first test case the sub-array [5, 2, 7, 1] has a total sum of 15 and is the longest one with this sum. It starts at index 1 and ends at index 4, so its length is 4.
- In the second test case there is no continuous sub-array in the array that adds up to 6. Hence, the result is 0.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T16:37:54.667Z  

```java
class Solution {
    public int longestSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int length = 0;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                sum += arr[j];
                if(sum == k){
                    length = Math.max(length, j - i + 1);
                }
            }
        }
        return length;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LONGGIVENSUM)