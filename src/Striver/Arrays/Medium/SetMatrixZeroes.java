package Striver.Arrays.Medium;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static int[][] setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int[] row = new int[n];
        int[] col = new int[m];

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }
    public static int[][] setZeroes_optimal(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int col1 = 1;

//        Setting markers like setting the 1st row and 1st col as 1 like markers
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (arr[i][j] == 0){
                    arr[i][0] = 0;
                    if(j != 0){
                        arr[0][j] = 0;
                    }else
                        col1 = 0;
                }
            }
        }

//        fill the row and col from [1,1] based on markers if marker is 0 then fill 0
        for (int i=1;i<n;i++){
            for (int j=1;j<m;j++) {
                if(arr[i][0] == 0 || arr[0][j] == 0){
                    arr[i][j] = 0;
                }
            }
        }

//        fill the 1st row based on [0,0] values if it is zero then fill row with 0
        if (arr[0][0] == 0){
        for (int j=0;j<m;j++){
                arr[0][j] = 0;
            }
        }

//        fill the 1st col based on col1 value if it is 0 then fill col with 0
            if (col1 == 0){
                for (int i=0;i<n;i++){
                arr[i][0] = 0;
            }
        }

        return arr;
    }
    static void main() {
        int[][] arr = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        int[][] arr1 = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        System.out.println(Arrays.deepToString(setZeroes(arr)));
        System.out.println(Arrays.deepToString(setZeroes_optimal(arr1)));
    }
}
