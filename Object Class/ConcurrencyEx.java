public class ConcurrencyEx implements Cloneable {
    private String t;//title
    private String a;//author
    private int y;//year
    public ConcurrencyEx(String t, String a, int y) {
        this.t = t;
        this.a = a;
        this.y = y;
    }
        public String toString() {
            return t + "by" + a + "(" + y + ")";
        }
        public boolean equals(Object o) {
            if (o == null || !(o instanceof ConcurrencyEx)) {
                return false;
            }
            ConcurrencyEx other = (ConcurrencyEx)o;
            return this.t.equals(other.getTitle()) && this.a == other.getAuthor() && this.y == other.getYear();
        }
        public int hashCode() {
            int res = 17;
            res = 31 * res + t.hashCode();
            res = 31 * res + a.hashCode();
            res = 31 * res + y;
            return res;
        }
        public ConcurrencyEx clone() {
            try{
                return (ConcurrencyEx)super.clone();
            }
            catch(CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
        protected void finalize() throws Throwable {
            System.out.println("Finalizing" + this);
        }
        public String getTitle() {
            return t;
        }
        public String author() {
            return a;
        }
        public int getYear() {
            return y;
        }
        public static void main(String[] args) {
            ConcurrencyEx c = new ConcurrencyEx("The Hitchhiker's guide to the galaxy", "Douglas Adams", 1874);
            System.out.println(c);
            ConcurrencyEx c1 = c.clone();
            System.out.println(c1);
            System.out.println(c.equals(c1));
            System.out.println(c.hashCode());
            System.out.println(c1.hashCode());
            c = null;
            System.gc();
        }
}