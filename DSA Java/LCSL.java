//find longest consecutive sequence length
package DSA;
import java.util.HashSet;
import java.util.Set;
public class LCSL {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int arr[] = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        for(int num : arr) {
            set.add(num);
        }
        System.out.println(set.size());
    }
}