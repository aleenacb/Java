//Nested interface inside an interface
interface OuterInterface {
    void show();
    interface InnerInterface {
        void msg();
    }
}
class NII implements OuterInterface.InnerInterface {
    public void msg() {
        System.out.println("Nested interface inside an interface");
    }
    public static void main(String[] args) {
        OuterInterface.InnerInterface obj = new NII();
        obj.msg();
    }
}