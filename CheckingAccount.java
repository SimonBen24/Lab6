public class CheckingAccount extends BankAccount {
    private static final double FEE = 0.15; // Fee for clearing one check

    // Constructor
    public CheckingAccount(String name, double initialBalance) {
        super(name, initialBalance);
        setAccountNumber(getAccountNumber() + "-10");
    }

    // Overriding the withdraw method to include the fee
    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount + FEE); // Add fee to withdrawal amount
    }
}
