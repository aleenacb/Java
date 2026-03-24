interface testInterface {
    final int a = 10;
    void display();
}
class InterfaceEx implements testInterface {
    public void display() {
        System.out.println("Aleena");
    }
}
class InterfaceEx1 {
    public static void main(String[] args) {
        InterfaceEx obj = new InterfaceEx();
        obj.display();
        System.out.println(obj.a);
    }
}