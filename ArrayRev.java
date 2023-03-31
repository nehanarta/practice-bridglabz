package Practice.Example;

public class ArrayRev {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 12, 13, 14, 15};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
