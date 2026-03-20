import java.util.Map;
import java.util.HashMap;
public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer>map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        System.out.println(map.get("a"));
        System.out.println(map.size());
    }
}