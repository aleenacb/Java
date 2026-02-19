class ReverseString {
    public static void main(String[] args) {
        //Original String
        String a = "Geeks";
        //Assign a empty string
        String b = " ";
        //Iterate through each character in string "a" from last index to first
        for(int i = a.length() - 1; i >= 0; i--) {
            //Extract the current character at index i f string "a"
            char ch = a.charAt(i);
            //Convert the character to String object using the Character.toString method
            String ch1 = Character.toString(ch);
            //Concat the converted string to end of b
            b = b.concat(ch1);
        }
        System.out.println(" "+ a);
        System.out.println(" " + b);
    }
}