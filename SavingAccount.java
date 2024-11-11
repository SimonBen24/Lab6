public class SavingAccount extends BankAccount {
    private static final double RATE = 0.025; // 2.5% annual interest rate
    private int savingsNumber = 0;
    private String accountNumber; // Hides the superclass's accountNumber

    // Constructor
    public SavingAccount(String name, double initialBalance) {
        super(name, initialBalance);
        accountNumber = getAccountNumber() + "-" + savingsNumber;
    }

    // Method to apply one month's interest to the balance
    public void postInterest() {
        double monthlyInterest = getBalance() * (RATE / 12);
        deposit(monthlyInterest);
    }

    // Overriding getAccountNumber method to return the SavingsAccount's account number
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    // Copy constructor to create a new savings account for the same owner
    public SavingAccount(SavingAccount originalAccount, double initialBalance) {
        super(originalAccount, initialBalance);
        this.savingsNumber = originalAccount.savingsNumber + 1;
        this.accountNumber = getAccountNumber() + "-" + this.savingsNumber;
    }
}
