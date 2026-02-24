class PC {
    String name;
    int id;

    PC(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println("Name: " + name + " id: " + id);
    }
    public static void main(String[] args) {
        PC p = new PC("Aleena", 101);
        p.display();
    }
}
