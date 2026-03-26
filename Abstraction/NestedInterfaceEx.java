class Outer {
    interface Inner{
        void display();
    }
}
class NestedInterfaceEx implements Outer.Inner{
    public void display() {
        System.out.println("nested interface");
    }
    public static void main(String[] args) {
        Outer.Inner obj = new NestedInterfaceEx();
        obj.display();
    }
}