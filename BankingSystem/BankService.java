package BankingSystem;

import java.util.*;

public class BankService {
    private List<BankAccount> bankAccounts = new ArrayList<>();
    private String accountNumber;

    public BankAccount createAccount(String type, String accountHolderName, double amount ){
        Random random = new Random();
        accountNumber = String.valueOf(random.nextLong(18746494));
        BankAccount bankAccount;
        if (type.equals("savings")){
            bankAccount = new SavingsAccount(accountNumber, accountHolderName, amount);
            bankAccount.displayAccountDetails();
        } else {
            bankAccount = new CurrentAccount(accountNumber, accountHolderName, amount);
            bankAccount.displayAccountDetails();
        }
        bankAccounts.add(bankAccount);
        return bankAccount;
    }

    public BankAccount findAccountByAccountNumber(String accountNumber){
        for (BankAccount account: bankAccounts){
            if (accountNumber.equals(account.getAccountNumber())){
                return account;
            }
        }
        return null;
    }

    public void performDeposits(double amount){
        BankAccount bankAccount = findAccountByAccountNumber(accountNumber);
        if (bankAccount != null) {
            bankAccount.deposit(amount);
        } else {
            System.out.println("================================================================");
            System.out.println("You do not have an account, Create an account to withdraw money.");
            System.out.println("================================================================");
        }
    }

    public void performWithdrawals(double amount){
        BankAccount bankAccount = findAccountByAccountNumber(accountNumber);
        if (bankAccount != null) {
            bankAccount.withdraw(amount);
        } else {
            System.out.println("=================================================================");
            System.out.println("You do not have an account, Create an account to withdraw money.");
            System.out.println("==================================================================");
        }
    }

    public double showBalances(){
        BankAccount bankAccount = findAccountByAccountNumber(accountNumber);
        return bankAccount.getBalance();
    }
}
