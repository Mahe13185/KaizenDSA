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
		    int res = 0;
		    int x = sc.nextInt();
		    
		    for (int i=0;i<x;i++){
		        res = res ^ Integer.parseInt(sc.next(),2);
		        
		    } 
		    
		   System.out.println(Integer.bitCount(res));
		   
		    
		    
		}

	}
}
