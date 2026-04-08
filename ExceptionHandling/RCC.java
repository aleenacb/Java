//Regex character class
import java.util.regex.*;
public class RCC {
    public static void main(String[] args) {
        String input = "abc123";
        System.out.println(input.matches(".*[a-z]+.*"));
    }
}