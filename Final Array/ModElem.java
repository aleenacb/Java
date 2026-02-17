//Modifying elements of final array
class ModElem {
    public static void main(String[] args) {
        final int[] arr= {10, 20, 30};
        arr[2] = 29;
        for(int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}