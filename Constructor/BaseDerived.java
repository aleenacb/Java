class Base {
    Base() {
        System.out.println("Base constructor");
    }
}
class Derived extends Base {
    Derived() {
        System.out.println("Derived constructor");
    }
}
public class BaseDerived {
    public static void main(String[] args) {
        Derived obj = new Derived();
    }
}