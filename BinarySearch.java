import java.util.Scanner;

class BinarySearch {
    public static void main(String args[]) {
        Binary aa = new Binary();
        aa.inputN();
        aa.input();
        aa.search();
    }
}

class Binary {
    int n, key;
    Scanner sc = new Scanner(System.in);
    int a[];

    void inputN() {
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        a = new int[n];
    }

    void input() {
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search");
        key = sc.nextInt();
        sc.close();
    }

    void search() {
        int i, j, mid;
        i = 0;
        j = n - 1;
        while (i <= j) {
            mid = (i + j) / 2;
            if (a[mid] == key) {
                System.out.println(mid);
                int m = 1;
                while (a[mid] == a[mid - m]) {
                    System.out.println(mid - m);
                    m++;
                }
                while (a[mid] == a[mid + m]) {
                    System.out.println(mid + m);
                    m++;
                }
                break;
            }
            if (a[mid] < key) {
                i = mid + 1;
            }
            if (a[mid] > key) {
                j = mid - 1;
            }
        }
    }
}

