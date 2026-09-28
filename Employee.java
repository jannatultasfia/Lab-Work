public class Employee {

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double higherSalary(Employee e) {
        if (this.salary > e.salary) {
            return this.salary;
        } else {
            return e.salary;
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Jannatul", 10000);
        Employee e2 = new Employee("Tasfia", 5000);
        double higher = e1.higherSalary(e2);
        System.out.println("Higher salary: " + higher);
    }
}
