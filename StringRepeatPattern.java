import java.util.*;

class StringRepeatPattern {
    static ArrayList<Integer> al = new ArrayList<Integer>();
    static ArrayList<Integer> bl = new ArrayList<Integer>();

    public static void main(String args[]) {
        String str = "geeks for geeks";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (!bl.contains(j)) {
                    if (str.charAt(i) == str.charAt(j) && !al.contains(i)) {
                        System.out.print(str.charAt(i) + " is at " + i + " " + j + " ");
                        al.add(i);
                        bl.add(j);
                    } else if (str.charAt(i) == str.charAt(j) && al.contains(i)) {
                        System.out.print(j + " ");
                        bl.add(j);
                    }
                }
            }
            System.out.println();
        }

    }
}