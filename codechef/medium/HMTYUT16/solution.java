import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		HashMap<String,Integer> map = new HashMap<>();
		
		String[] str = s.toLowerCase().split("\\s+");
		
		for (int i=0;i<str.length;i++){
		    map.put(str[i],map.getOrDefault(str[i],0)+1);
		    
		} 
		Map<String,Integer> tree = new TreeMap<>(map);
		
		for(Map.Entry<String,Integer> entry : tree.entrySet()){
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}
}
