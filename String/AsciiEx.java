class AsciiEx {
    public static void main(String[] args) {
        byte ascii[] = {71, 70, 71};
        String firstString = new String(ascii);
        System.out.println(firstString);
        String secondString = new String(ascii, 1, 2);
        System.out.println(secondString);
    }
}