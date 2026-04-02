public class trycEx1 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 1;  
        } catch (NullPointerException e) {
            System.out.println("Null Pointer");
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Array out of bounds");
        } finally {
            System.out.println("Done");
        }
    }
}