//Modifying elements in a final array and attempting reassignment
import java.util.Arrays;
public class FinalArrayEx {
    public static void main(String[] args) {
        final int[] num= {10, 20, 30, 40, 50};
        num[0] = 15;
        System.out.println(Arrays.toString(num));
    }
}
