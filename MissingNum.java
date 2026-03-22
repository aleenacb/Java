public class MissingNumber {
    public static int findMissing(int[] arr, int n) {
        int sum = n * (n + 1) / 2;
        int actual = 0;

        for(int num : arr)
            actual += num;

        return sum - actual;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(findMissing(arr, 5)); // 3
    }
}
