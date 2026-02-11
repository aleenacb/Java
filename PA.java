public class PA {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        System.out.println("Primitive Array ->");
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " ");
            System.out.println();
            //Non Primitive arrays
            String[] names = {"Aleena","Ann", "Anna","Joe", "Alice"};
            int s = names.length;
            for(int i = 0; i < s; i++)
                System.out.print(names[i] + " ");
    }
}