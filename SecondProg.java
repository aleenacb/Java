import java.util.HashMap;
public class SecondProg {
    public static void main(String[] args) {
        String text = "intermediate";
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : text.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        System.out.println("Character Frequencies: "+charCount);
    }
}
