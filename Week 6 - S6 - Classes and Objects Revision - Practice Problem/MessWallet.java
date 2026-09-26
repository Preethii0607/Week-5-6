class MessWallet {
    private double balance;

    // Public constructor
    public MessWallet(double openingBalance) {
        if (openingBalance < 0) {
            System.out.println("Warning: Negative opening balance given. Starting at 0.");
            this.balance = 0;
        } else {
            this.balance = openingBalance;
        }
    }

    // Public method to top up balance
    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up rejected: amount must be greater than 0.");
        } else {
            balance += amount;
            System.out.println("Balance after top-up: " + balance);
        }
    }

    // Public method to deduct balance
    public void deduct(double amount) {
        if (amount > balance) {
            System.out.println("Deduct rejected: insufficient balance");
        } else {
            balance -= amount;
        }
    }

    // Public getter for read-only access
    public double getBalance() {
        return balance;
    }
}

public class WalletTest {
    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(500);
        wallet.topUp(200);       // Output: Balance after top-up: 700.0
        wallet.deduct(1000);     // Output: Deduct rejected: insufficient balance
        System.out.println("Final balance: " + wallet.getBalance()); // Output: Final balance: 700.0
    }
}