package OOPDesignPrinciples.ObjectModelling.Level1.BankAssociation;
public class Bank {

    /*
     This class represents a Bank that associates with customers.
     The relationship is association since customers and bank
     can exist independently while interacting with each other.
    */

    // Opens an account for a customer
    public void openAccount(Customer customer) {
        System.out.println("Account opened for customer.");
        customer.viewBalance();
    }

    public static void main(String[] args) {
        // Creating customer
        Customer customer = new Customer("Alice", 5000);

        // Bank interacting with customer
        Bank bank = new Bank();
        bank.openAccount(customer);
    }
}
