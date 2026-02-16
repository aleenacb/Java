import java.util.*;
public class StringList {
    public static void main(String[] args) {
        List<String>names = Arrays.asList("Ashish", "geek", "Amiya");
        names.stream().filter(s->s.startsWith("A")).count();
        //System.out.println(names);
    }
}