package Striver.Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascelTraingle {
    public static List<List<Integer>> Solution(int n){
        List<List<Integer>> result = new ArrayList<>();

        for (int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for (int j=0;j<=i;j++){
                if (j==0 || j==i){
                    row.add(1);
                }else {
                    int value = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                    row.add(value);
                }
            }
            result.add(row);
        }
        return result;
    }

    static void main() {
        System.out.println(Solution(5));
    }
}
