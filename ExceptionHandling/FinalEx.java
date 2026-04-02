class FinalEx {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            int res = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic exception"+e.getMessage());
        } finally {
            System.out.println("Finally block executes");
        }
    }
}