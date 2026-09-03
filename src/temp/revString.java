package temp;

public class revString {
    static String reverse(String str){
        if (str.isEmpty()) return str;

        return str.substring(1) + str.charAt(0);
    }

    static void main() {
        String str = "Hello";
        System.out.println(reverse(str));
    }
}
