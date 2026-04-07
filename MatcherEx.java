import java.util.regex.Pattern;
import java.util.regex.Matcher;

class MatcherEx {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("Java");
        Matcher m = p.matcher("Java.org");
        while(m.find()){
            System.out.println("Pattern found from"+m.start() + "to" + (m.end() - 1));
        }
    }
}