import java.util.regex.*;
public class RMP {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("Java");
        Matcher matcher = p.matcher("Java is java");
        System.out.println(matcher.matches());
        System.out.println(matcher.lookingAt());
        while(matcher.find()) {
            System.out.println("Match found");
        }
    }
}