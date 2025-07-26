package BankingSystem;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    /**
     * This method overrides implementation of withdraw
     * @param amount is the amount to be withdrawn by user - decreases balance
     */
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100){
            setBalance(getBalance() - amount);
            System.out.println("====================================================");
            System.out.println("Withdrawal Successful!");
            System.out.println("Current balance: R" + getBalance());
            System.out.println("=====================================================");
        } else {
            System.out.println("======================================================");
            System.out.println("Insufficient, A minimum of R100 is required to a keep account afloat");
            System.out.println("======================================================");
        }
    }
}
