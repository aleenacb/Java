package OOPS.AccessModifier;
class Car {
    String model;
}
public class DefaultEx {
    public static void main(String[] args) {
        Car c = new Car();
        c.model= "Tesla";
        System.out.println(c.model);
    }
}
