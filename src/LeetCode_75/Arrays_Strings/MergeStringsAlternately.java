package LeetCode_75.Arrays_Strings;

public class MergeStringsAlternately {
    public static String mergeStringsAlternatively(String word1,String word2){
        int len1 = word1.length();
        int len2 = word2.length();

        char[] res = new char[len1+len2];
        int i =0,j=0,k=0;
        while (i < len1 && i < len2){
            res[k++] = word1.charAt(i++);
            res[k++] = word2.charAt(j++);
        }
        while (i<len1){
            res[k++] = word1.charAt(i++);
        }
        while (j<len1){
            res[k++] = word2.charAt(j++);
        }

        return new String(res);
    }
    static void main() {
        System.out.println(mergeStringsAlternatively("abc","xyz"));
    }
}
