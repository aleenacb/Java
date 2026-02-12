import java.util.Scanner;
public class UserTwoDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the number f columns :");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.print("Enter the Elements");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("Elements of array are");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}