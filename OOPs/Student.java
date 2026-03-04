class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Anu", 30000);
        Employee e2 = new Employee(2, "Rahul", 40000);

        e1.increaseSalary(10);
        e2.increaseSalary(5);

        e1.display();
        e2.display();
    }
}
