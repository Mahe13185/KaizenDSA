package temp;

import java.util.HashMap;

public class Hashmap_working {
    static void main() {
        HashMap<Integer,Integer> seen = new HashMap<>();

        seen.put(5,0);
        seen.put(4,1);
        int value1 = 6;
        int update = seen.getOrDefault((5,0)+1);
    }
}
