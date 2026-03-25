public class FunctionalInterface {
    public static void main(String[] args) {
        new Thread(()->
        System.out.println("New Thread created")).start();
    }
}