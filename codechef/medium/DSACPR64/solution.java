import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[][] arr = new int[n][2];
	    
	    for(int i=0;i<n;i++){
	        arr[i][0] = sc.nextInt();
	        arr[i][1] = sc.nextInt();
	    }
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    boolean found = false;
	    for(int i=0;i<n;i++){
	    int x = arr[i][0];
	    int y = arr[i][1];
	    
	    if((a == x || a == y) && (b == x || b == y)){
	        found = true;
	        break;
	    }
	    }
	    System.out.println( (found) ? "Yes" : "No");
	}
}
