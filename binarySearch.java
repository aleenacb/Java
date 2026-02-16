import java.util.Arrays;
public class binarySearch{
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        Arrays.sort(arr);
        int key = 20;
        System.out.println("key found at index = "+ Arrays.binarySearch(arr, key));
    }
}