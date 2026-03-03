import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {

    public static void main(String[] args)
        throws IOException{
            
        // Step 1: Create BufferedReader object
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        // Step 2: Prompt user for input
        System.out.print("Enter an integer: ");

        // Step 3: Read and parse input
        int number = Integer.parseInt(reader.readLine());

        // Step 4: Print the entered integer
        System.out.println("You entered: " + number);
    }
}
