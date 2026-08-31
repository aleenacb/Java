public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 121;
        int original = n;
        int reverse = 0;
        while ( n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        if (original == reverse) 
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}