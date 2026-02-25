class CO {
    CO(String name) {
        System.out.println(name);
    }
    CO(String n, int age) {
        System.out.println("Name : "+ n + " " + age);
    }
    CO(long id) {
        System.out.println("Constructor" + "long " + id);
    }
}
    public class CoEx {
        public static void main(String[] args) {
            CO obj = new CO("Aleena");
            CO obj1 = new CO("Amiya",28);
            CO obj2 = new CO(56321456);
        }
    }
