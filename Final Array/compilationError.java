//Compilation error when reassigning final reference
class compilationError {
    int p = 20;
    public static void main(String[] args) {
        final compilationError CE = new compilationError();
        compilationError CE1 = new compilationError();
        CE = CE1;
        System.out.println(CE.p);
    }
}