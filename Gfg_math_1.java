public class Gfg_math_1 {
    public static void main(String args[]) {
        Gfg_math_1 gfg = new Gfg_math_1();
        System.out.println("Trailing zeroes in 25 is " + gfg.trailingZeroes(25));
        System.out.println("Normal gcd of 10,3 is " + gfg.normalGcd(10, 3));
        System.out.println("Effective gcd of 10,3 is " + gfg.effectiveGcd(10, 3));
        System.out.println("Ultimate gcd of 10,3 is " + gfg.ultimateGcd(3, 10));
        System.out.println("LCM using Ultimate gcd of 10,3 is " + gfg.lcmUsingUltimateHcf(3, 10));
        
    }

    // factorial using recursion
    int recursiveFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return (n * recursiveFact(n - 1));
    }

    // factorial using iteration
    int iterativeFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a *= i;
        }
        return a;
    }

    // trailing zeroes in factorial
    int trailingZeroes(int n) {
        int i = 5;
        int count = 0;
        while (n / i != 0) {
            count += n / i;
            i *= 5;
        }
        return count;
    }

    int normalGcd(int a, int b) {
        int min = Math.min(a, b);
        while (min > 0) {
            if (a % min == 0 && b % min == 0) {
                break;
            }
            min--;
        }
        return min;
    }

    int effectiveGcd(int a, int b) {
        if (b > a) {
            return effectiveGcd(b, a);
        } else if (a == b) {
            return a;
        } else {
            return effectiveGcd(a - b, b);
        }
    }

    int ultimateGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return ultimateGcd(b, a % b);
    }

    int lcmUsingUltimateHcf(int a, int b) {
        Gfg_math_1 gfg = new Gfg_math_1();
        return ((a * b) / gfg.ultimateGcd(a, b));
    }

}