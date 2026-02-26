class toStringEx {
    String name = "aleena";
    int age = 20;
    public String toString() {
        return "Student{name='"+ name + "', age = " + age+ "}";
    }
    public static void main(String[] args) {
        toStringEx obj = new toStringEx();
        System.out.println(obj.toString());
    }
}