import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for(int num : arr){
            if(!seen.add(num)){
                duplicate.add(num);
            }
        }

        System.out.println("Duplicates: " + duplicate);
    }
}
