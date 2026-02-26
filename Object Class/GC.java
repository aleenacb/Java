//Get class method
class GC {
    public static void main(String[] args) {
        Object o = new String("Java");
        Class c = o.getClass();
        System.out.println(c.getName());
    }
}