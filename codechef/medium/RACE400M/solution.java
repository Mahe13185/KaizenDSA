import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = 400/scanner.nextInt();
            int y = 400/scanner.nextInt();
            int z = 400/scanner.nextInt();
            
            if(x > y && x > z) System.out.println("Alice");
            else if(y > x && y > z) System.out.println("Bob");
            else System.out.println("Charlie");
            
        }
    }
}
