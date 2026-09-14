package temp;

public class StringBuilderExample {
    static void main() {
        String text = "Hello world";
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();

        String res = sb.toString();
        System.out.println(res);
        System.out.println(sb);

        char[] charArray = {'J', 'a', 'v', 'a'};

// Conversion
        String str = new String(charArray);



        System.out.println(str); // Output: Java

    }
}
