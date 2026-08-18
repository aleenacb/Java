public class SolidRectangle {
    public static void main(String[] args) {
        int n = 3, m = 5;
        //loop through each row
        for (int i = 1; i <= n; i++) {
            //loop through each row in the current column
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
