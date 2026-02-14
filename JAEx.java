class JAEx {
    public static void main(String[] args) {
        int r = 5;
        int[][] arr = new int[r][];

        //Creating a 2d array such that first row has i element, second row has two elements 
        for(int i = 0; i < arr.length; i++)
            arr[i] = new int[i + 1];//i + 1 column

            //Initializing array
            int count = 0;
            for(int i = 0; i < arr.length; i++) 
                for(int j = 0; j < arr[i].length; j++) 
                    arr[i][j] = count++;
            //Displaying the values of 2d jagged array
            System.out.println("Contents of jagged array");
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) 
                    System.out.print(arr[i][j] + " ");
                    System.out.println();
            }
    }
}