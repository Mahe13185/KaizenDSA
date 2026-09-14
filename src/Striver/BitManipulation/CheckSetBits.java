package Striver.BitManipulation;

public class CheckSetBits {
    static int check(int n ){
        int count = 0;
        while(n > 0){
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }
    static int check1(int n ){
        int count = 0;
        while(n > 0){
           n = n & (n-1);
           count++;
        }
        return count;
    }

    static void main() {
        System.out.println(check(15));
        System.out.println(check1(15));
    }
}
