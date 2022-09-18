public class MaxSumOf2Elements {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
        int max1 = arr[0], max2 = arr[0], index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
                index = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max2 && i != index) {
                max2 = arr[i];
            }
        }
        System.out.println(max1 + max2);
    }
}
