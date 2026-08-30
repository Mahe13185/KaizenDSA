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
            int target = sc.nextInt();
            int result = -1;
            for (int i=0;i<n;i++){
                if(sc.nextInt() == target){ 
                    result = i;
                    continue;
                }
            }
            System.out.println(result);
        }
	}
}
