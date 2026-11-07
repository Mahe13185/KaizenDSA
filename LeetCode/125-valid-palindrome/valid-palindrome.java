class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left< right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            right--;
            left++;
        }
        return true;
        
        
        // String clean = "";
        // for(int i=0;i<s.length();i++){
        //     if(Character.isLetterOrDigit(s.charAt(i))){
        //         clean = clean + s.charAt(i);
        //     }
        // }
        // clean = clean.toLowerCase();
        // int left = 0;
        // int right = clean.length()-1;
        // while(left < right){
        //     if(clean.charAt(left) != clean.charAt(right))
        //         return false;
        //     left++;
        //     right--;
        // }
        // return true;
    }
}