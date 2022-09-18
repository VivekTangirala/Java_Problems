import java.util.*;

public class StarPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(i));
            System.out.print("*");
            System.out.print(" ".repeat((n-i-1)+((i<n-1)?n-2-i:0)));
            if (i!=n-1)
                System.out.print("*");

            System.out.println();
        }
        sc.close();
    }
}
