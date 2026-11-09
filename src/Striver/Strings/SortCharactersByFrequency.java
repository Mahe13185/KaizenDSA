package Striver.Strings;

import java.util.*;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        HashMap<Character,Integer> seen = new HashMap<>();
        for (char ch : s.toCharArray())
            seen.put(ch,seen.getOrDefault(ch,0) + 1);
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(seen.entrySet());
        list.sort( (a,b) -> b.getValue() - a.getValue());

        StringBuilder str = new StringBuilder();

        for(Map.Entry<Character,Integer> entry : list){
            char ch = entry.getKey();
            int count = entry.getValue();

            for (int i=0;i<count;i++){
                str.append(ch);
            }
        }

        return str.toString();
    }
    static void main() {
        System.out.println(frequencySort("tree"));
    }
}
