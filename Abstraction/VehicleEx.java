interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle implements Vehicle {
    int speed;
    int gear;
    public void changeGear(int newGear) {
        gear = newGear;
    }
    public void speedUp(int increment) {
        speed = speed + increment;
    }
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println("Speed"+speed + "gear"+ gear);
    }
}
class Bike implements Vehicle {
    int speed;
    int gear;
    public void changeGear(int newGear) {
        gear = newGear;
    }
    public void speedUp(int increment){
        speed = speed + increment;
    }
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println("Speed:"+speed + "gear"+gear);
    }
}
class VehicleEx {
    public static void main(String[] args) {
        Bicycle bi = new Bicycle();
        bi.changeGear(2);
        bi.speedUp(3);
        bi.applyBrakes(1);
        System.out.println("Bicycle present state");
        bi.printStates();
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        System.out.println("Bike present state");
        bike.printStates();
        }
}