class CompanyEmployee {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public CompanyEmployee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++; // Increments once inside the constructor, every time[cite: 5]
    }

    // Static method that prints companyName and employeeCount without referencing instance fields[cite: 5]
    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class CompanyEmployeeTest {
    public static void main(String[] args) {
        // Create three Employee objects[cite: 5]
        CompanyEmployee e1 = new CompanyEmployee("Alice", 45000);
        CompanyEmployee e2 = new CompanyEmployee("Bob", 52000);
        CompanyEmployee e3 = new CompanyEmployee("Charlie", 60000);

        // Call printCompanyInfo() through the class name, not through any object[cite: 5]
        CompanyEmployee.printCompanyInfo();
    }
}