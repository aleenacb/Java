class Animal{
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void sound() {
        System.out.println("Dog barks");
    }
}
class cat extends Animal{
    void sound() {
        System.out.println("Cat meows");
    }
}
class cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }
}
public class InheritanceEx {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();

        a = new cat();
        a.sound();

        a = new cow();
        a.sound();
    }
}