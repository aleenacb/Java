class ConcatEx {
    public static void main(String[] args) {
        String s = "Sachin";
        s.concat("Tendulkar");
        String str = "Sun";
        str = str.concat(" Microsystems");
        System.out.println(str);
        System.out.println(s);//This will print sachin because strings are immutable objects
    }
}
