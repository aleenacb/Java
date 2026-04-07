//Optional class 
import java.util.Optional;
class OC {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);
        //Safe way to access
        System.out.println(name.orElse("Default name"));
    }
}