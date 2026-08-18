class LS {
    //Method searches for an element x
    public static int search(int arr[], int N, int x) {
        //Iterates through each and every element
        for (int i = 0; i < N; i++) {
            //if array of an element matches the x then it return i 
            if (arr[i] == x)
            return i;
        }
        return -1;// if element not found return -1
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        //call the search method
        int result = search(arr, arr.length, x);
        if (result == -1)
        System.out.println("Element not found");
        else 
        System.out.println("Element found at index " + result);
    }
}