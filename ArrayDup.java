package Practice.Example;

public class ArrayDup {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 4, 6, 7, 9, 6, 11, 8, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[j]);
                    }
                }
            }
        }
    }
}