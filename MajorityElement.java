public class MajorityElement {
    public static int findMajority(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {3,3,4,2,3,3,5};
        System.out.println(findMajority(arr));
    }
}
