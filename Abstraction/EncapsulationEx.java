class Programmer {
    private String name;
    //Getter method to get the data
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class EncapsulationEx {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("Aleena");
        System.out.println(p.getName());
    }
}