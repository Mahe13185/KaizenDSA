package LeetCode_75.Arrays_Strings;

public class GreatestCommonDivisorofStrings {
    public static int gcd_helper(int a, int b){
        return (b==0) ? a : gcd_helper(b , a%b);
    }
    public static String greatestCommonDivisorofStrings(String str1, String str2){
        if(!(str1+str2).equals((str2+str1))){
            return "";
        }
        int gcd_length = gcd_helper(str1.length(), str2.length());
        return  str1.substring(0,gcd_length);
    }

    static void main() {
        System.out.println(greatestCommonDivisorofStrings("abababab","abab"));
    }
}
