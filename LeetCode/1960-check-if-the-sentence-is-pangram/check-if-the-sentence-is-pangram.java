class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for(char ch : sentence.toCharArray()){
            seen[ch - 'a'] = true;
        }
        for(Boolean b : seen){
            if(!b) return false;
        }
        return true;
    }
}