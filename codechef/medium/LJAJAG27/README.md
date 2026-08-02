# LJAJAG27

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-02T10:20:49.691Z  

```java
import java.util.*;
class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    String op = sc.next();
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    switch(op){
	        case "+":
	            System.out.println(a+b);
	            break;
	       case "-":
	           System.out.println(a-b);
	           break;
	       case "*":
	           System.out.println(a*b);
	           break;
	       case "/":
	           if (b==0){
	               System.out.println("Error: Division by zero is not allowed.");
	           } else{
	               System.out.println(a/b);
	           }
	           break;
	       case "%":
	           if( b==0){
	               System.out.println("Error: Division by zero is not allowed.");
	           }else{
	               System.out.println(a%b);
	           }
	           break;
	       default:
	       System.out.println("Invalid operatior! Please use one of the following: +,-,*,/,%");
	    }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAJAG27)