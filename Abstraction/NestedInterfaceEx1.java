interface Parent {
    protected interface Test {
        void show();
    }
}
class Child implements Parent.Test {
    public void show() {
        System.out.println("Show method of interface");
    }
}
class NestedInterfaceEx1 {
    public static void main(String[] args) {
        Parent.Test obj;
        Child t = new Child();
        obj = t;
        obj.show();
    }
}