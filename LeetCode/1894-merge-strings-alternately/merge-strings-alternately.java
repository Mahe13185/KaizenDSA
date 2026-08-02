class Solution {
    public String mergeAlternately(String word1, String word2) {

        int len1 = word1.length();
        int len2 = word2.length();

        char[] result = new char[len1 + len2];
        int i =0;
        int j=0;
        int k=0;
        while(i < len1 && i < len2){
            result[k++] = word1.charAt(i++);
            result[k++] = word2.charAt(j++);
        }
        while(i<len1){
            result[k++] = word1.charAt(i++);
        }
        while(j<len2){
            result[k++] = word2.charAt(j++);
        }
        return new String(result);
    }
}