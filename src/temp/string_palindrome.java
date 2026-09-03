package temp;

public class string_palindrome {
    static Boolean palindrome(String s , int left , int right){
        if(left > right) return true;
        if(s.charAt(left) != s.charAt(right)) return false;
        else return palindrome(s,left+1,right-1);
    }

    static void main() {
        String str = "racecar";
        System.out.println(palindrome(str,0,str.length()-1));
    }
}
