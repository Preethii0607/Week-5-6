class PayrollAccount {
    private double basicSalary;
    private double bonus;

    // Public constructor accepting opening basic salary[cite: 5]
    public PayrollAccount(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Warning: Negative basic salary given. Starting at 0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = basicSalary;
        }
        this.bonus = 0;
    }

    // Public method to credit bonus[cite: 5]
    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Bonus credit rejected: amount must be greater than 0.");
        } else {
            bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }

    // Public method to deduct tax by percentage[cite: 5]
    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Tax deduction rejected: percent must be between 0 and 100.");
        } else {
            basicSalary -= basicSalary * (percent / 100.0);
            System.out.println("Tax deducted: " + (int)percent + "%");
        }
    }

    // Public getNetSalary method for read-only access[cite: 5]
    public double getNetSalary() {
        return basicSalary + bonus;
    }
}

public class PayrollTest {
    public static void main(String[] args) {
        PayrollAccount account = new PayrollAccount(50000);
        account.creditBonus(5000); // Output: Bonus credited: Rs 5000.0
        account.deductTax(10);     // Output: Tax deducted: 10%
        System.out.println("Net salary: Rs " + account.getNetSalary()); // Output: Net salary: Rs 50000.0
    }
}