import java.util.ArrayList;

class AdjacentOfMinimumNumber {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(1);
        al.add(4);
        al.add(3);
        al.add(8);
        al.add(6);
        System.out.println(al);
        for (int i = 0; i < al.size(); i++) {
            int min = al.get(0);
            if (al.get(i) < min) {
                min = al.get(i);
            }
        }
    }
}
