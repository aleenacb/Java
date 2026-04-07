public class ChainedExceptionsEx {
    public static void main(String[] args) {
        try{
            //Creating an primary exception
            NumberFormatException ex = new NumberFormatException("Primary Exception");
            //Setting up the cause of the exception
            ex.initCause(new NullPointerException("Root cause of the exception"));
            //Throwing an exception with cause
            throw ex;
        } catch(NumberFormatException ex) {
            //Displaying the primary exception
            System.out.println("Caught Exception:" + ex);
            //Displaying the root cause of exception
            System.out.println("Root cause:"+ex.getCause());
        }
    }
}