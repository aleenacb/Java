import java.util.Scanner;
import java.util.Locale;
public class IPOP {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    sc.useDelimiter(",\\s*");
    System.out.println("Enter your name, age, grade, height");
    String name = sc.next();
    int age = sc.nextInt();
    char grade = sc.next().charAt(0);
    float height = sc.nextFloat();
    System.out.println("Your Name" + name);
    System.out.println("Your age" + age);
    System.out.println("Your grade" + grade);
    System.out.println("Your height" + height);
    sc.close();
    }
}