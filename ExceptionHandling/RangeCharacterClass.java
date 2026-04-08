public class RangeCharacterClass {
    public static void main(String[] args) {
        String regex = "[0-9]";
        System.out.println("5".matches(regex));
        System.out.println("a".matches(regex));
    }
}