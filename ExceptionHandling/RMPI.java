//retrieving match positions using index methods
import java.util.regex.*;
public class RMPI {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(java)");
        Matcher matcher = pattern.matcher("I love Java");
        if(matcher.find()) {
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println(matcher.start(1));
            System.out.println(matcher.end(1));
        }
    }
}