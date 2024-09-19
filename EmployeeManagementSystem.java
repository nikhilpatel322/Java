class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.printf("Salary: %.2f%n", salary);
    }

    public double calculateBonus() {
        return 0.10 * salary;
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }

    @Override
    public double calculateBonus() {
        return 0.20 * salary;
    }
}

class Intern extends Employee {
    int duration;

    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }

    @Override
    public double calculateBonus() {
        return 500;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Nikhil", 101, 80000, "HR");
        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.printf("Bonus: %.2f%n%n", manager.calculateBonus());

        Intern intern = new Intern("smith", 102, 30000, 6);
        System.out.println("Intern Details:");
        intern.displayDetails();
        System.out.printf("Bonus: %.2f%n", intern.calculateBonus());
    }
}
