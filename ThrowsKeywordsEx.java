import java.io.*;
class ThrowsKeywordsEx {
    static void readFile(String fileName)throws IOException {
        try(FileReader file = new FileReader(fileName)) {
            int data;
            while((data = file.read())!= -1) {
                System.out.print((char)data);
            }
        }
    }
    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch(IOException e) {
            System.out.println("File not found or error reading file"+e.getMessage());
        }
    System.out.println("Program continues after file operation");
    }
}