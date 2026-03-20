class Person {
    void role() {
        System.out.println("I am a person");
    }
}
class Father extends Person {
    void role() {
        System.out.println("Iam a father");
    }
}
public class PolymorphismEx {
    public static void main(String[] args) {
        Person p  = new Father();
        p.role();
    }
}