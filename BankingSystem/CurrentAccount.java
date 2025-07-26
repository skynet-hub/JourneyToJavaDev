package BankingSystem;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    /**
     * A specific implementation of withdraw
     * @param amount is the amount to be withdrawn by user - decreases balance
     */
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount > -500.00){
            setBalance(getBalance() - amount);
            System.out.println("====================================================");
            System.out.println("Withdrawal Successful!");
            if (getBalance() < 0){
                System.out.println("Current balance: R" + (-1 * getBalance()) + " Overdrawn");
            } else {
                System.out.println("Current balance: R" + getBalance());
            }
            System.out.println("===================================================");
        } else {
            System.out.println("======================================================");
            System.out.println("Overdraft limit exceeded.");
            System.out.println("======================================================");
        }
    }
}
