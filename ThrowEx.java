public class ThrowEx {
    static void checkAge(int age) throws AgeException {
        if(age < 18) {
            throw new AgeException("Age must be 18 or above" + age);
        }
        System.out.println("Access granted");
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println("caught" + e.getMessage());
        }
    }
}