interface A {
    default void display() {
        System.out.println("Interface A display");
    }
}
interface B {
    default void display() {
        System.out.println("Interface B display");
    }
}
class C implements A,B{
    public void display() {
        A.super.display();
        B.super.display();
        System.out.println("Class c display");
    }
}
public class MultipleInheritanceInterfaceEx {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}