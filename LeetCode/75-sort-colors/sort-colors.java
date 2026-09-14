class Solution {
    public void sortColors(int[] arr) {
        int counter1=0,counter2=0,counter0=0;
        for(int ele : arr){
            if(ele == 0) counter0++;
            else if(ele == 1) counter1++;
            else counter2++;
        }
        for(int i=0;i<counter0;i++){
            arr[i] = 0;
        }
        for(int i=counter0;i<counter0+counter1;i++){
            arr[i] = 1;
        }
        for(int i=counter0+counter1;i<arr.length;i++){
            arr[i] = 2;
        }
    }
}