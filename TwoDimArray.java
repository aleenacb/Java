public class TwoDimArray {
    public static void main(String[] args) {
        int[][] arr = new int[1][3];
        arr[0][0] = 3;
        arr[0][1] = 4;
        arr[0][2] = 5;
        System.out.print(arr[0][0]+" ");
        System.out.print(arr[0][1]+" ");
        System.out.print(arr[0][2]+" ");
        for(int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}