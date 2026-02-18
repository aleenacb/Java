import java.util.StringTokenizer;
class StringTokenizerEx {
    public static void main(String[] args) {
        String s = "Hello Aleena";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }   
    }
}