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
