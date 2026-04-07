import java.util.regex.Pattern;
class CharClassEx {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]","g"));
        System.out.println(Pattern.matches("[a-zA-z]","GFG"));
    }
}