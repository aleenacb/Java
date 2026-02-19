//String Exception
class SE {
    public static void main(String[] args) {
        String s1 = "computer";
        String s2 = null;
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}