import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i=0;i<s.length();i++){
		    System.out.println(s.charAt(i));
		}
		
		for (int i=0;i<s.length();i++){
		    for(int j=i+1;j<s.length();j++){
		        char s1 = s.charAt(i);
		        char s2 = s.charAt(j);
		        String s3 = "" + s1 + s2;
		        System.out.println(s3);
		    }
		    
		} 
		
		System.out.println(s);

	}
}
