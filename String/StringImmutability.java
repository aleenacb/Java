class StringImmutability {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println("s1 == s2 = " +(s1 == s2));
        s1 = s1.concat(" world");
        System.out.println("s1=" + s1);
        System.out.println("s2 = " + s2);
        System.out.println("S1 == s2 = " + (s1 == s2));
        String s3 = new String("Hello");
        System.out.println("s2 == s3 = " + (s2 == s3));
        System.out.println("s2.equals(s3): " + s2.equals(s3));
    }
}