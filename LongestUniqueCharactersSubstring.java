import java.util.*;

public class LongestUniqueCharactersSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        sc.close();
        String ans = "";
        HashSet<Character> hs = new HashSet<Character>();
        for (int i = 0, j = 0; i < s1.length(); i++) {
            j = 0;
            while (!hs.contains(s1.charAt(i + j))) {
                hs.add(s1.charAt(i + j));
                j++;
                if (i + j >= s1.length()) {
                    break;
                }
            }
            hs.clear();
            if (j + 1 > ans.length()) {
                ans = s1.substring(i, i + j);
            }
        }
        System.out.println(ans);
    }
}
