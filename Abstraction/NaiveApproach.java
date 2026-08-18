public class NaiveApproach {
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;//sum of first n natural numbers or n * (n + 1)/2
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(findSum(n));
    }
}
