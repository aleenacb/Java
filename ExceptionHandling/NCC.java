//Negated character class
public class NCC {
    public static void main(String[] args) {
        String regex = "[^0-9]";
        String r = "[0-9]{2,4}";
        System.out.println("6, 4".matches(r));
        System.out.println("a".matches(regex));
        System.out.println("5".matches(regex));
    }
}