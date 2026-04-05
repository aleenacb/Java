import java.util.*;

public class NextGreaterCircular {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                res[stack.pop()] = num;
            }
            
            if (i < n) {
                stack.push(i);
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(Arrays.toString(nextGreaterElements(arr)));
    }
}
