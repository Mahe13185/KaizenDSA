package Striver.BitManipulation;

public class CheckEvenOrOdd {
       static public boolean isOdd(int n) {
            if( (n & 1) == 1) return true;
            else
                return false;
    }

    static void main() {
        System.out.println(isOdd(4));
    }
}
