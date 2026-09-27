package Striver.Arrays.Medium;

public class PrintMatrixInSprial {
    static void main() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        System.out.println(matrix[1].length);

        while (top <= bottom && left <= right) {
            //move from left to right
            for (int i = left;i<=right;i++){
                System.out.println(matrix[top][i] + " ");
            }
            top++;

            for (int i= right;i<=bottom;i++){
                System.out.println(matrix[i][right]);
            }
        }

        System.out.println(top);
        System.out.println(bottom);
        System.out.println(left);
        System.out.println(right);
    }
}
