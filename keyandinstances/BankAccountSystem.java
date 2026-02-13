package KeyAndInstances;
public class BankAccountSystem {

    /*
     This program represents a simple bank account system that demonstrates
     the use of static, this, final, and instanceof keywords. It shows how
     shared bank information is maintained using static variables, immutable
     account numbers using final variables, and safe object handling using
     instanceof checks.
    */

    // Static variable shared across all bank accounts
    static String bankName = "National Bank";

    // Static variable to track total accounts
    static int totalAccounts = 0;

    // Final variable ensures account number cannot be changed
    final int accountNumber;

    // Instance variable for account holder name
    String accountHolderName;

    // Constructor initializes account details using this keyword
    public BankAccountSystem(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++; // Increment total accounts count
    }

    // Static method to display total number of accounts
    static void displayTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Method displays account details after checking object type
    void displayAccountDetails(Object obj) {
        // Ensure object belongs to BankAccountSystem class
        if (obj instanceof BankAccountSystem) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        // Create a bank account object
        BankAccountSystem account =
                new BankAccountSystem("Ramesh", 1001);

        // Display account details
        account.displayAccountDetails(account);

        // Display total accounts
        displayTotalAccounts();
    }
}
