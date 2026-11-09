class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> seen = new HashMap<>();
        for(int i=0;i<s.length();i++){
            seen.put(s.charAt(i) , seen.getOrDefault(s.charAt(i),0) + 1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(seen.entrySet());

        list.sort( (a,b) -> Integer.compare(b.getValue() , a.getValue()) );

        StringBuilder res = new StringBuilder();

        for(Map.Entry<Character,Integer> entry : list){
            char ch = entry.getKey();
            int count = entry.getValue();
            String temp = String.valueOf(ch).repeat(count);
            res.append(temp);
        }
        return res.toString();
    }
}