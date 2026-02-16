import java.util.*;
public class ArrayFill {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.fill(arr, -1);
        for(int val:arr)
        System.out.print(val+"");
    }
}