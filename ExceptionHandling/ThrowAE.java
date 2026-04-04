//Throwing an arithmetic expression
class ThrowAE {
    public static void main(String[] args) {
        int numerator = 1;
        int denominator = 0;
        if(denominator == 0) {
            //Manually throw an arithmetic exception
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            System.out.println(numerator/denominator);
        }
    }
}