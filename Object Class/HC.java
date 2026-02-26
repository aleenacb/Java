class HC {
    int id = 101;
    public int hashCode() {
        return id * 31;
    }
    public static void main(String[] args) {
        HC hc = new HC();
        System.out.println(hc.hashCode());
    }
}