class PC {
    private PC() {
        System.out.println("Private constructor called");
    }
    public static void display() {
        System.out.println("Hello message from Java");
    }
}
class PCEx {
    public static void main(String[] args) {
        PC.display();
    }
}