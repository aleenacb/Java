class FinalizeEx {
    public static void main(String[] args) {
        FinalizeEx f = new FinalizeEx();
        System.out.println("Hashcode"+f.hashCode());
        //Making the object eligible for garbage collection
        f = null;
        System.gc();//Garbage collection
        //Acting short delay to allow GC to act 
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of the garbage collection");
    }
    protected void finalize() {
        System.out.println("called the finalize() method");
    }
}