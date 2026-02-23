//Check even or odd
class Even {
    public static boolean isEven(int n) {
        int rem = n % 2;
        if(rem == 0) {
            return true;
        }
        else {
         return false;
        }
    }
    public static void main(String[] args) {
        int n = 15;
        if(isEven(n) == true)
        System.out.print("true");
        else
        System.out.print("false");
    }
}
