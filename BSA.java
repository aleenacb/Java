//Binary Search with arguments-> binarySearch(array, fromIndex, toIndex, key, comparator)
import java.util.Arrays;
public class BSA {
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 50, 60};
        Arrays.sort(arr);
        int key = 40;
        System.out.println(key + "found at index = " +Arrays.binarySearch(arr, 1, 3, key));
    }
}