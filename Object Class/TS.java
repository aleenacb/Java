//toString and hashCode
class TS {
    String n;
    public TS(String n) {
        this.n = n;
    }
    public String toString() {
        return "Person{name:'" + n + "'}";
    }
    public static void main(String[] args) {
        TS p = new TS("Geek");
        System.out.println(p.toString());
        System.out.println(p.hashCode());
    }
}
