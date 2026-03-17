class Vehicle {
    Vehicle() {
        System.out.println("this is a vehicle");
    }
}
class car extends Vehicle {
    car() {
        System.out.println("this vehicle is a car");
    }
}
public class SingleInheritanceEx {
    public static void main(String[] args) {
        car obj = new car();
    }
}