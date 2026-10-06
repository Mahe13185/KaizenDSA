class Solution {
    public boolean isPalindrome(int x) {
        int check =  x;
        boolean isNegative = false; 
        int rev = 0;
        if(x < 0){
            isNegative = true;
        }
        while(x != 0){
            int digit = x % 10;
            x = x / 10;
            rev = rev * 10 + digit;
        }

        if(isNegative){
            rev = - (rev);
        }
        if(check == rev){
            return true;
        }
        return false;
    }
}