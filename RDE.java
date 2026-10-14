public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        System.out.println("Array without duplicates:");

        for (int i = 0; i < arr.length; i++) {
            boolean repeated = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    repeated = true;
                    break;
                }
            }

            if (!repeated) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
