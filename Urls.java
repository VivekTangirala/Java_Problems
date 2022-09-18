import java.util.*;

public class Urls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextLine());
        }
        int a = 0;
        for (int i = 0; i < n; i++) {
            String s="";
            a++;
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        System.out.println(al);
        System.out.println(a);
    }
}
