interface PI1 {
    default void show() {
        System.out.println("Default PI1");
    }
}
interface PI2 {
    default void show() {
        System.out.println("Default PI2");
    }
}
class PI implements PI1, PI2 {
    public void show() {
        PI1.super.show();
        PI2.super.show();
        System.out.println("C class display");
    }
    public void showOfPI1() {
        PI1.super.show();
    }
    public void showOfPI2() {
        PI2.super.show();
    }
    public static void main(String[] args) {
        PI pi = new PI();
        pi.show();
        System.out.println("Now executing showOfPI1()" + " and showOfPI2()");
        pi.showOfPI1();
        pi.showOfPI2();
    }
}