class Employee {
    String empId;
    String empName;
    double salary;
    boolean isIntern;

    // Constructor for permanent employees[cite: 5]
    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    // Constructor for interns chaining via this(...)[cite: 5]
    public Employee(String empId, String empName) {
        this(empId, empName, 0.0);
        this.isIntern = true;
    }

    // Method to print all four fields on one line[cite: 5]
    public void printProfile() {
        System.out.println(empId + " -| " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }
}

public class EmployeeProfileTest {
    public static void main(String[] args) {
        Employee permanentEmp = new Employee("E101", "Divya", 65000);
        Employee internEmp = new Employee("E102", "Arjun");

        permanentEmp.printProfile(); // Output: E101 -| Divya | Rs 65000.0 | Intern: false
        internEmp.printProfile();    // Output: E102 -| Arjun | Rs 0.0 | Intern: true
    }
}