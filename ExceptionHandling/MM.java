//Replacing matched text using matcher methods
import java.util.regex.*;
public class MM {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(Java)(\\d)");
        Matcher m = p.matcher("Java is java");
        System.out.println(m.replaceFirst("Java"));
        System.out.println(m.replaceAll("Java"));
        m.reset();
        StringBuffer sb = new StringBuffer();
        while(m.find()) {
            m.appendReplacement(sb, "Java");
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}