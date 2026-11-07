class Solution {
    public boolean isPalindrome(String s) {
        String clean = "";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                clean = clean + s.charAt(i);
            }
        }
        clean = clean.toLowerCase();
        int left = 0;
        int right = clean.length()-1;
        while(left < right){
            if(clean.charAt(left) != clean.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}