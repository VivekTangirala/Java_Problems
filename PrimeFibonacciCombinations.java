import java.util.*;

public class PrimeFibonacciCombinations {
    public static ArrayList<Integer> prime(int a, int b) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                al.add(i);
            }
        }
        return al;
    }

    public static ArrayList<Integer> stringCombination(ArrayList<Integer> sl) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < sl.size(); i++) {
            String s = "";
            for (int j = 0; j < sl.size(); j++) {
                if (i == j) {
                    continue;
                }
                s = sl.get(i).toString() + sl.get(j).toString();
                al.add(Integer.parseInt(s));
            }
        }
        return al;
    }

    public static boolean isPrime(int a) {
        boolean prime = true;
        for (int j = 2; j * j <= a; j++) {
            if (a % j == 0) {
                prime = false;
            }
        }
        return prime;
    }

    public static ArrayList<Integer> primeList(ArrayList<Integer> sl) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < sl.size(); i++) {
            if (isPrime(sl.get(i))) {
                al.add(sl.get(i));
            }
        }
        return al;
    }

    public static int nFibonacci(int a, int b, int n) {
        int nth = 0;
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            return b;
        }

        for (int i = 0; i < n - 2; i++) {
            nth = a + b;
            a = b;
            b = nth;
        }
        return nth;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 40;
        ArrayList<Integer> al = primeList(stringCombination(prime(a, b)));
        int max = al.get(0);
        int min = al.get(0);
        for (int index = 0; index < al.size(); index++) {
            if (al.get(index) < min) {
                min = al.get(index);
            }
            if (al.get(index) > max) {
                max = al.get(index);
            }
        }
        System.out.println(min + " " + max + " " + al.size() + " " + prime(1, 20));
    }
}
