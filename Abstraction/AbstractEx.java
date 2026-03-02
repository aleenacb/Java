abstract class TV {
    abstract void turnOn();
    abstract void turnOff();
}
class TVRemote extends TV {
    void turnOn() {
        System.out.println("TV is turned on");
    }
    void turnOff() {
        System.out.println("TV is turned off");
    }
}
public class AbstractEx {
    public static void main(String[] args) {
        TV remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}
