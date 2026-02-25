class A {
    private A() {
        System.out.println("Private constructor");
    }
    public static void createInstance() {
        new A();
    }
}
public class PCEx1 {
    public static void main(String[] args) {
        A.createInstance();
    }
}