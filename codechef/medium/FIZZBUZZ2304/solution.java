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
	      int k = sc.nextInt();
	      int[] arr = new int[n];
	      
	      for (int i=0;i<n ;i++ ){
	          arr[i] = sc.nextInt();
	      }
	      
	      int answer = 0;
	      int oddCount =0;
	   //   first window
	   for(int i=0;i<k;i++){
	       if((arr[i] & 1) == 1)
	           oddCount++;
	   }
	       if(oddCount > 0)
	            answer++;
	   //slide window
	   for(int right=k;right < arr.length;right++){
	       int left =  right - k;
	       if((arr[left] & 1) == 1)
	           oddCount--;
	       if((arr[right] & 1) == 1)
	            oddCount++;
	            
	       if(oddCount>0){
	           answer++;
	       }
	   }
	   System.out.println(answer);
	  }
	}
}
