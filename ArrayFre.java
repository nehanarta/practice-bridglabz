package Practice.Example;

public class ArrayFre {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 3, 4, 5, 6, 6};
        int[] freq = new int[arr.length];
        int replace = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = replace;

                }
                if (freq[i] != replace) {
                    freq[i] = count;
                }
            }
           for ( i = 0; i < freq.length; i++) {
                if (freq[i] != replace) {
                    System.out.println("Element | frequency");
                    System.out.println(arr[i]+ " | " +freq[i]);
                }
            }
        }
    }
}