package Recursion;

public class chatgpt {
    static void coundown(int n){
        if(n==0) return;

        System.out.println(n);
        coundown(n -1);
    }
//    static int sum =0;
//    static void sumOfNNumbers(int n){
//        if (n==0) return;
//        sum += n;
//        sumOfNNumbers(n-1);
//    }
    static int sumOfNNumbers(int n){
        if (n==0) return 0;

        return n + sumOfNNumbers(n-1);
    }

    static int factorial(int n){
        if (n==0) return 1;

        return n * factorial(n-1);
    }

    static void printNumbers(int n){
        if (n==0) return;
        System.out.println(n);
        return  ;
    }

    static void main() {
        coundown(5);
        sumOfNNumbers(5);

    }
}
