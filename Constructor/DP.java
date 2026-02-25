//Combined both Default and private constructor
class Demo {
    int num;
    Demo() {
        this(100);
        System.out.println("Default Constructor");
    } 
    Demo(int n) {
        num = n;
        System.out.println("Parameterized constructor");
    }
}
public class DP {
    public static void main(String[] args) {
        Demo obj = new Demo();
    }
}