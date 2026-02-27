class cloneEx implements Cloneable {
    int id = 1;
    String name = "Aleena";
    public Object clone() throws CloneNotSupportedException {
        return super.clone();//shallow copy
    }
    public static void main(String[] args) throws Exception{
        cloneEx s1 = new cloneEx();
        cloneEx s2 = (cloneEx)s1.clone();
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}