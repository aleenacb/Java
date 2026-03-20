class Parent {
    void print() {
        System.out.println("Iam parent");
    }
}
    class Subclass1 extends Parent {
        void print() {
            System.out.println("Am subclass1");
        }
    }
    class Subclass2 extends Parent{
        void print() {
            System.out.println("Am subclass2");
        }
    }
public class OverridingEx {
    public static void main(String[] args) {
        Parent a;
        a = new Subclass1();
        a.print();
        a = new Subclass2();
        a.print();
    }
}
