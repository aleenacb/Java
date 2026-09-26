//consecutive using HashSet
package DSA;
import java.util.HashSet;
import java.util.Set;
public class CUH {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 100, 4, 0, 200};
        Set<Integer> set = new HashSet<>();
        for(int num : arr) {
            set.add(num);
        }
        int longestLen = 0;
        for(int num : arr) {
            if(!set.contains(num - 1)) {
                int currentNum = num;
                int currentLen = 1;
                while(set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLen++;
                }
                if(currentLen > longestLen) {
                    longestLen = currentLen;
                }
            }
        }
        System.out.println(longestLen);
    }
}