package Striver.Arrays.Medium;

import java.util.Arrays;

public class RotateArrayBy90 {
    static int[][] solution(int[][] matrix){
        int n = matrix.length;
        int[][] newArray = new int[n][n];
        for (int i=0;i<n;i++){
            //for creating rotated array
            for (int j=0;j<n;j++){
                newArray[j][n-i-1] = matrix[i][j];
            }
        }
        return newArray;
    }
    static void main() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(solution(arr)));
    }
}
