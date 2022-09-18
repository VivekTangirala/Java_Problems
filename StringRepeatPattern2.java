import java.util.*;

public class StringRepeatPattern2 {
    public static void main(String[] args) {
        LinkedHashMap<Character, ArrayList<Integer>> lhm = new LinkedHashMap<Character, ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            ArrayList<Integer> al = new ArrayList<Integer>();
            al = lhm.getOrDefault(str.charAt(i), new ArrayList<Integer>());
            al.add(i);
            lhm.put(str.charAt(i), al);
        }
        System.out.println(lhm);
    }
}
