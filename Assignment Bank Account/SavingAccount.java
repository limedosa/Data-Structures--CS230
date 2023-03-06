import java.text.NumberFormat;
/**
 * Write a description of class savingAccount here.
 *
 * @author (Shawfong, Linda Dominguez)
 * @version (2/26/23)
 */

public class SavingAccount extends Account
{
    private final double interestRate = .05;
    
    /**
     * Calcuates the savings in acc after the intrest rate 
     */
    public void balancePostInterest(int month){
        double monthInterest = (interestRate / 12.0) * month; //12 months 
        double interest = accountBalance * monthInterest;
        accountBalance += interest;
    }
    /**
     * @param int number of money for initial deposit
     * @param2 int intrest rate for this acc 
     * 
     * setting up saving acc with intial deposit and intrest rate 
     */
    public SavingAccount(double initialDeposit){
        super(initialDeposit);
        // interestRate = rate;
    }
    /**
     * @param double amount of money to withdraw from the acc, int month of withdrawal
     * Can only withdraw if there is enought money in the acc otherwise unable to
     */
    public void withdraw(double amount){

        if (accountBalance >= amount){
            accountBalance -= amount;
        } else if (accountBalance < amount){
            System.out.println("Not enought money in account. Unable to withdraw");
        }
    }
    /**
     * @returns a string representation of the balance in the saving acc
     */
    public String toString(){
        String s = super.toString();
        NumberFormat fmt = NumberFormat.getPercentInstance();
        return s + "\n Interest Rate: " + fmt.format(interestRate);
    }
    /**
     * Testing
     */
    public static void main(String[] args) {
        SavingAccount savingAcc1 = new SavingAccount(50000.00);
        System.out.println("Account1 has a starting balance of $" + savingAcc1.getBalance());
        savingAcc1.balancePostInterest(12);  // means it should have gained a 5% interest rate / 12 months  => gained money bc withdrew nothing
        System.out.println("Withdraw $0.00 after 12 amount of months");
        savingAcc1.withdraw(0.0);
        System.out.println("After a withdrawal of $0, the balance is $" + savingAcc1.accountBalance +"\n"); // Expected output: $52500.00
        
        SavingAccount savingAcc2 = new SavingAccount(50000.00);
        System.out.println("Account2 has a starting balance of $" + savingAcc2.getBalance());
        savingAcc2.balancePostInterest(6);  // means 50000 * .5 interest for 6 months - 1200 
        System.out.println("Withdraw $1200.00 after 6 months");
        savingAcc2.withdraw(1200.00);
        System.out.println("After a withdrawal of $1200, the balance is still $" + savingAcc2.accountBalance +"\n"); // Expected output: $50
        
        SavingAccount savingAcc3 = new SavingAccount(100.00);
        System.out.println("Account3 has a starting balance of $" + savingAcc3.getBalance());
        savingAcc3.balancePostInterest(6);  // means 100 * .5 interest for 6 months - 20
        System.out.println("Withdraw $20.00 after 6 months");
        savingAcc3.withdraw(20.00);
        System.out.println("After a withdrawal of $20, the balance is $" + savingAcc3.accountBalance +"\n");// Expected output: $82

        SavingAccount savingAcc4 = new SavingAccount(50.00);
        System.out.println("Account3 has a starting balance of $" + savingAcc4.getBalance());
        savingAcc4.balancePostInterest(12);  // means 50 * .5 interest for 12 months - 20
        System.out.println("Withdraw $53 after 12 months");
        savingAcc4.withdraw(53);
        System.out.println("After a withdrawal of $53, the balance is $" + savingAcc4.accountBalance +"\n");// Expected output: $0, if you withdraw 52.5 instead,it's $0.00
        // SavingAccount saving1 = new SavingAccount(100.0,0.5); 
        // System.out.print("Original Deposit " + initialDe)
    }
}