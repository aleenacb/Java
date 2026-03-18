import java.util.Arrays;

public class SortWords {
    public static void main(String[] args) {
        String str = "java is easy to learn";
        String[] words = str.split(" ");

        Arrays.sort(words);

        for(String word : words){
            System.out.print(word + " ");
        }
    }
}
