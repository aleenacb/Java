//import java.util.regex.*;
public class RCCEx {
    public static void main(String[] args) {
        String regex = "[abc]";
        System.out.println("a".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("d".matches(regex));
    }
}