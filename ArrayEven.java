package Practice.Example;

public class ArrayEven {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 7, 8};
        //for(int i=2; i<arr.length;i=i+2) {
        //  System.out.println(arr[i]);
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}

