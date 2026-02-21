public class StringConstructor {
    public static void main(String[] args) {
        String str1 = new String("Hello Java");
        System.out.println(str1);
        char[] charArray = {'j', 'a', 'v', 'a'};
        String str2 = new String(charArray);
        System.out.println(str2);
        byte[] byteArray = {72, 101, 108, 108, 111};
        String s3 = new String(byteArray);
        System.out.println(s3);
    }
}