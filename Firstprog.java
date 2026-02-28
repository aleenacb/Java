import java.util.ArrayList;
public class Firstprog {
    public static void main(String[] args) {
        //creating an list of array
        ArrayList<String> fruits = new ArrayList<>();
        //adding fruits
        fruits.add("Apple");
        fruits.add("Bannana");
        fruits.add("Cherry");
        //Accessing elements
        System.out.println("First Fruit: "+ fruits.get(2));
        //iterating through list
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        //Removing an elements
        fruits.remove("Bannana");
        System.out.println("After removal: " + fruits);
    }
}
