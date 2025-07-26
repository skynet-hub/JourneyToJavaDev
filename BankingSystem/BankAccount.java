package BankingSystem;

abstract public class BankAccount {

    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    /**
     * @param amount is the amount of money the holder of account is depositing - increases balance
     */
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("=========================================");
        System.out.println("Deposit Successful!");
        System.out.println("Current balance: R" + getBalance());
        System.out.println("==========================================");
    }

    /**
     * To be implemented by subclasses
     *
     * @param amount is the amount to be withdrawn by user - decreases balance
     */
    public abstract void withdraw(double amount);

    /**
     * @return the account number associated with an account
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * @return Account balance, the amount in account
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * @return Name of the account holder
     */
    public String getAccountHolderName(){
        return this.accountHolderName;
    }

    /**
     * @param amount, new amount to be set on balance
     */
    public void setBalance(double amount){
        this.balance = amount;
    }

    public void displayAccountDetails(){
        System.out.println("Account Number: " + this.accountNumber + "\n"
                + "Name of Account Holder: " + this.accountHolderName + "\n"
                + "Balance: R" + this.getBalance()
        );
    }
}