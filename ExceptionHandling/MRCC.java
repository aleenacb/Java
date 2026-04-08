//Multiple ranges in character class
public class MRCC {
    public static void main(String[] args) {
        String regex = "[a-zA-z0-9]";
        System.out.println("A".matches(regex));
        System.out.println("b".matches(regex));
        System.out.println("5".matches(regex));
    }
}