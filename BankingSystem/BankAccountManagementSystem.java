package BankingSystem;

public class BankAccountManagementSystem {
    public static void main(String[] args){
        boolean isOn = true;
        BankService bankService = new BankService();
        InputUtils inputUtils = new InputUtils();
        int count = 0;

        System.out.println("Welcome to WLTcode simple Banking System!");

        while (isOn){
            displayMenu();

            int choice = inputUtils.getInt();

            switch (choice){
                case 1:
                    if (count <1){
                    System.out.println("Enter the type of Account you want....");
                    System.out.println("1. Savings Account");
                    System.out.println("2. Current Account");
                    int choice2 = inputUtils.getInt();
                    System.out.print("Enter your name: ");
                    String name = inputUtils.getString();
                    System.out.print("Enter the amount you want to deposit: ");
                    double depositAmount = inputUtils.getDouble();
                    System.out.println("=====================================================================");
                    if (choice2 == 1){
                        bankService.createAccount("savings",name, depositAmount);
                    } else {
                        bankService.createAccount("currentAccount", name, depositAmount);
                    }
                    System.out.println("Account Successfully Created! Start banking.");
                    System.out.println("========================================================================");
                    count++;
                    } else {
                        System.out.println("You already have an Account with us!");
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double amount = inputUtils.getDouble();
                    bankService.performDeposits(amount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double amountToWithdraw = inputUtils.getDouble();
                    bankService.performWithdrawals(amountToWithdraw);
                    break;
                case 4:
                    System.out.println("==================================================");
                    if (bankService.showBalances() < 0){
                        System.out.println("Current balance: R" + (-1 * bankService.showBalances()) + " Overdrawn");
                    } else {
                        System.out.println("Current balance: R" + bankService.showBalances());
                    }
                    System.out.println("===================================================");
                    break;
                case 5:
                    System.out.println("Quiting program..............");
                    isOn = false;
                    break;
                default:
                    System.out.println("Invalid input, Look up the menu to make a valid request!");
            }
        }

    }

    private static void displayMenu(){
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
    }
}
