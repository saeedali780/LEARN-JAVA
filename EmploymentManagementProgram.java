
/*
 * Requirement 1: Abstraction
 * Create an abstract class named Employee.
 */
abstract class Employee {
    /*
     * Requirement 2: Encapsulation
     * Declare name and basicSalary as private variables.
     */
    private String name;
    private double basicSalary;

    // Constructor to initialize employee details.
    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Public getter to access the employee's name.
    public String getName() {
        return name;
    }

    // Public getter to access the basic salary.
    public double getBasicSalary() {
        return basicSalary;
    }

    // Public setter to update the employee's name.
    public void setName(String name) {
        this.name = name;
    }

    // Public setter to update the basic salary.
    public void setBasicSalary(double basicSalary) {
        if (basicSalary >= 0) {
            this.basicSalary = basicSalary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Abstract method: subclasses must provide their own salary calculation.
    public abstract double calculateSalary();

    // Normal method to display employee information.
    public void displayInfo() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Basic Salary: PKR " + getBasicSalary());
    }
}

/*
 * Requirement 3: Inheritance
 * PermanentEmployee inherits properties and methods from Employee.
 */
class PermanentEmployee extends Employee {

    // Constructor to initialize a permanent employee.
    public PermanentEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    /*
     * Requirement 4: Polymorphism
     * Override calculateSalary() to add a 10% bonus
     * to the permanent employee's basic salary.
     */
    @Override
    public double calculateSalary() {
        return getBasicSalary() + (getBasicSalary() * 0.10);
    }
}

/*
 * Inheritance: ContractEmployee also extends Employee.
 */
class ContractEmployee extends Employee {

    // Constructor to initialize a contract employee.
    public ContractEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    /*
     * Polymorphism: Override calculateSalary() to add
     * a fixed allowance of PKR 5,000.
     */
    @Override
    public double calculateSalary() {
        return getBasicSalary() + 5000;
    }
}

/*
 * Requirement 5: Main Method
 * Create objects and display employee information and salaries.
 */
public class EmploymentManagementProgram {

    public static void main(String[] args) {

        // Create one object of each employee type.
        PermanentEmployee permEmp = new PermanentEmployee("Saeed Ali", 50000);

        ContractEmployee contEmp = new ContractEmployee("Rukhsar Mari", 40000);

        // Display permanent employee details.
        System.out.println("=== Permanent Employee ===");
        permEmp.displayInfo();
        System.out.println("Calculated Salary: PKR " + permEmp.calculateSalary());

        System.out.println();

        // Display contract employee details.
        System.out.println("=== Contract Employee ===");
        contEmp.displayInfo();
        System.out.println("Calculated Salary: PKR " 
        + contEmp.calculateSalary());
    }
}
