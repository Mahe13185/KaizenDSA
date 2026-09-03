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
	        int y = sc.nextInt();
	        int sum = 0;
	        for(int i =0;i<n;i++){
	            sum |= sc.nextInt();
	        }
	        if((sum | y) != y){
	            System.out.println("-1");
	        }else{
	            int x = y ^ sum;
	            System.out.println(x);
	        }
	    }
	}
}
