package Striver.Arrays.Easy;

public class Consecutive_ones {
        static int findMaxConsecutiveOnes(int[] nums) {
            int present_count = 0;
            int max_count = 0;
            for(int num : nums){
                if(num == 1){
                    present_count++;
                    if( present_count > max_count){
                        max_count = present_count;
                    }
                }
                if(num == 0){
                    present_count = 0;
                }
            }
            return max_count;
        }

    static void main() {
        int[] arr = {0,1,1,0,1,0,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
        }
}
