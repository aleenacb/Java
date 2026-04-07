import java.util.regex.Pattern;
class RegexEx {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("geeks.*","geeksforgeeks"));
        System.out.println(Pattern.matches("geeks[0-9]+","geeks12s"));
    }
}