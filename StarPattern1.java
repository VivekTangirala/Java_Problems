import java.util.*;

class StarPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(n - i - 1));
            System.out.print("*");
            System.out.print(" ".repeat(i + (i > 0 ? (i - 1) : 0)));
            if (i > 0)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}