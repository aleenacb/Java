public class MultipleCatch {
    public static void main(String[] args) {
        try{
            System.out.println("Outer try block started");
            try{
                int n =10;
                int res = n/0;
            } catch(ArithmeticException e) {
                System.out.println("Caught arithmetic exception"+e);
            }
            try{
                String s = null;
                System.out.println(s.length());
            } catch(NullPointerException e) {
                System.out.println("Caught null pointer exception "+e);
            }
        } catch(Exception e) {
            System.out.println("Caught exception in outer"+e);
        } finally {
            System.out.println("Finally block executes");
        }
        System.out.println("Program executes after nested try catch");
    }
}