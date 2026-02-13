package OOPDesignPrinciples.ObjectModelling.Level1.BankAssociation;
public class Customer {

    /*
     This class represents a bank customer.
     A customer is associated with a bank and can view
     account-related information without owning the bank.
    */

    // Stores customer name
    private String name;

    // Stores account balance
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Displays current balance
    public void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}
