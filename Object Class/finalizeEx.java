class finalizeEx {
    public static void main(String[] args) {
        finalize f = new finalize();
        System.out.println(f.hashCode());
        f = null;
        //calling garbage collector
        System.gc();
        System.out.println("end");
    }
    @Override protected void finalize() {
        System.out.println("finalize method called");
    }
}