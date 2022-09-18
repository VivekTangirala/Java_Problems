import java.util.*;

public class SquarePattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the square");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println();
            if (i == 0 || i == n - 1) {
                System.out.print("* ".repeat(n));
                continue;
            }
            System.out.print("* " + "  ".repeat(n - 2) + "*");
        }
        sc.close();
    }
}
