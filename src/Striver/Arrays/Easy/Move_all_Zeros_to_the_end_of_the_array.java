package Striver.Arrays.Easy;

public class Move_all_Zeros_to_the_end_of_the_array {
    static void main() {
//        my solution
        int[] arr = {1,0,2,3,0,4,0,1};
//        int index = 0;
//        for (int i=0;i<arr.length;i++){
//            if(arr[i] != 0){
//                arr[index] = arr[i];
//                index++;
//            }
//        }
//        for (int i = index;i<arr.length;i++){
//            arr[i] = 0;
//        }
//       striver solution optimal

        int j= -1;
        for (int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        for(int i = j+1;j<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
