//Modifying object state referenced by final variable
class objectFinal {
    int p = 20;
    public static void main(String[] args) {
        final objectFinal obj = new objectFinal();
        obj.p = 30;
        System.out.println(obj.p);
    }
}