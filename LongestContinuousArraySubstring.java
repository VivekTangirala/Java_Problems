import java.util.*;

public class LongestContinuousArraySubstring {
    public static void main(String[] args) {
        int maxlen = 1;
        int[] arr = { 4, 10, 2, 11, 5, 21, 3 };
        int startInt = arr[0];
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }
        for (Integer integer : hs) {
            int temp = 1;
            int tempInt = integer;
            while (hs.contains(tempInt + 1)) {
                temp += 1;
                tempInt += 1;
            }
            if (temp > maxlen) {
                maxlen = temp;
                startInt = integer;
            }
        }
        for (int i = 0; i < maxlen; i++) {
            System.out.println(startInt + i);
        }
    }
}