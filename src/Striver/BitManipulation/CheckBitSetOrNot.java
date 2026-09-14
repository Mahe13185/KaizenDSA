package Striver.BitManipulation;

public class CheckBitSetOrNot {
        static boolean checkIthBit(int n, int i) {
            if( (n & 1 << i) != 0) return true;
            else return false;
        }

    static void main() {
        System.out.println(checkIthBit(10,1));
    }

}
