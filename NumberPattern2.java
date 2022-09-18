import java.util.*;

public class NumberPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            int l = i;
            for (int j = 0; j < i; j++) {
                System.out.print(l + " ");
                l += (n - j - 1);
            }
        }
    }
}
