//Using ternary operator
class TO {
    public static void main(String[] args) {
        String s = null;
        String m = (s == null) ? "" : s.substring(0, 5);
        System.out.println(m);
        s = "GeeksForGeeks";
        m = (s == null) ? "" : s.substring(0, 5);
        System.out.println(m);
    }
}