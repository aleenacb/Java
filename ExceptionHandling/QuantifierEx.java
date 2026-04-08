public class QuantifierEx {
    public static void main(String[] args) {
        String input = "0007";
        System.out.println(input.matches("0*\\d"));
        //0* allows xero or more occurrences of 0
        //\d matches a digit
        //The string "0007" satisfies the pattern
    }
}