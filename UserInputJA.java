import java.util.Scanner;
class UserInputJA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of sub-array");
        int r = sc.nextInt();

        //Declare the jagged array
        int[][] ja = new int[r][];
        for(int i = 0; i < r; i++) {
            System.out.print("Enter the size of sub-array" + (i + 1) + ":");
            int size = sc.nextInt();
            ja[i] = new int[size];
        }
        for(int i = 0; i < r; i++) {
            System.out.println("Enter the number of elements" + (i + 1)+":");
            for(int j = 0; j < ja[i].length; j++) {
                ja[i][j] = sc.nextInt();
            }
        }
        System.out.println("The jagged array");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < ja[i].length; j++) {
                System.out.print(ja[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}