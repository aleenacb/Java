class StudentEx {
    public int roll_no;
    public String name;

    // Constructor
    StudentEx(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Student {
    public static void main(String[] args) {

        // declares an Array of StudentEx
        StudentEx[] arr;

        // allocating memory for 5 objects
        arr = new StudentEx[5];

        // initialize the elements of the array
        arr[0] = new StudentEx(1, "aman");
        arr[1] = new StudentEx(2, "vaibhav");
        arr[2] = new StudentEx(3, "shikar");
        arr[3] = new StudentEx(4, "dharmesh");
        arr[4] = new StudentEx(5, "mohit");

        // accessing the elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + " : { "
                    + arr[i].roll_no + " "
                    + arr[i].name + " }");
        }
    }
}
