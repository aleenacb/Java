//Method overriding with unchecked exception
class superClass {
    void method() {
        System.out.println("Super class method executed");
    }
}
class subClass extends superClass {
    void method() throws ArithmeticException {
        System.out.println("Subclass method executed");
        throw new ArithmeticException("Exception in subclass");
    }
    public static void main(String[] args) {
        superClass s = new subClass();
        try{
            s.method();
        } catch (ArithmeticException e) {
            System.out.println("Caught exception:"+e.getMessage());
        }
    }
}