import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "anagram";
        String s2 = "nagaram";
        sc.close();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            hm.put(s1.charAt(i), hm.getOrDefault(s1.charAt(i), 0) + 1);
        }
        System.out.println(hm);
        for (int i = 0; i < s2.length(); i++) {
            if (hm.get(s2.charAt(i)) == null) {
                System.out.println("Not an anagram");
                return;
            }
            if (hm.get(s2.charAt(i)) == 0) {
                System.out.println("Not an anagram");
                return;
            }
            hm.put(s2.charAt(i), hm.get(s2.charAt(i)) - 1);
            if (hm.get(s2.charAt(i)) == 0) {
                hm.remove(s2.charAt(i));
            }
        }
        if (hm.size() == 0) {
            System.out.println("An anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}
