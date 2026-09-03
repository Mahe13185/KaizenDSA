import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int count = 0;
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for (int i=0;i<n ;i++){
		        arr[i] = sc.nextInt();
		    } 
		    
		    for (int i=0;i<30 ;i++){
		        for (int j=0;j<n ;j++ ) {
		            if ((arr[j] & (1 << i)) != 0){
		                count++;
		                break;
		            } 
		        }
		    } 
		    System.out.println(count);
		}
		
	}
}
