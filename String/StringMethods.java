class StringMethods {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.indexOf(7));
        System.out.println(s.indexOf(2, 7));
        System.out.println(s.charAt(3));
        System.out.println(s.substring(4));
        System.out.println(s.substring(2, 9));
        System.out.println(s.concat("Welcome to Java Program"));
        System.out.println(s.indexOf("World"));
        System.out.println(s.indexOf("l", 2));
        System.out.println(s.lastIndexOf("l"));
        System.out.println(s.equals("Hello World"));
        System.out.println(s.equalsIgnoreCase("Hello World"));
        System.out.println(s.compareTo("Hello Java"));
        System.out.println(s.compareToIgnoreCase("Hello java"));
        System.out.println("'" + s.trim() + "'");
        System.out.println(s.replace("l", "x"));
        System.out.println(s.contains("World"));
        System.out.println(s.startsWith("Hello"));
    }
}