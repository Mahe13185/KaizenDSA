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

    public static List<Integer> Solution1(int row1){
        List<List<Integer>> result = new ArrayList<>();
        int n = 5;
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
            if(i==row1){
               return row;
            }
            result.add(row);
        }
        return new ArrayList<>(0);
    }

    static void main() {
        System.out.println(Solution(5));
        System.out.println(Solution1(3));
    }
}
