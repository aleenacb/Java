class CharArray {
    public static void main(String[] args) {
        char characters[] = {'G', 'F', 'G'};
        String firstString = new String(characters);
        String secondString = new String(firstString);
        System.out.println(firstString);
        System.out.println(secondString);
    }
}