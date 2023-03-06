import java.text.NumberFormat;
/**
 * Creates a checking account
 * @author (Shawfong, Linda Dominguez)
 * @version (2/26/23)
 */

 public class CheckingAccount extends Account
{   
    //instance variables
    private final double minimumBalance = 100.00;
    private final double overdraftFee = -25.00;
    
    /**
     * initial deposit of money into the checking account 
     */
    public CheckingAccount(double initialDeposit){
        super(initialDeposit);
    }

    /**
     * @param: amount of money 
     * 
     * Withdrawing money from account but if there isn't enough money in the acc will charge
     * overdraft fee of $50
     */
    public void withdraw(double amount){
        if(amount > accountBalance){
            System.out.println("Not enought money in Checking Account. Unable to Withdraw");
        }else if((accountBalance - amount) > minimumBalance){
            accountBalance -= amount;
        }else if((accountBalance - amount) < minimumBalance){
            System.out.println("Below Minimum Balance. Charge overdraft fees.");
            this.accountBalance = accountBalance - amount + overdraftFee;
        }            
    }
    /**
     * returns a string of the amount of money in the account 
     */
    public String toString(){
        String checkingReport = super.toString();
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return checkingReport + "\n Minimum balance is: " + fmt.format(minimumBalance);
    }
    /**
     * Testing
     */
    public static void main(String[] args) {
        CheckingAccount checkingAcc1 = new CheckingAccount(2099.19);
        System.out.println("Account1 has a starting balance of $" + checkingAcc1.getBalance());
        System.out.println("Withdraw $200.00");
        checkingAcc1.withdraw(200);
        System.out.println("After a withdrawal of $200" + ", the balance is $" + checkingAcc1.accountBalance + "\n" ); // Expected output: $1899.19

        CheckingAccount checkingAcc2 = new CheckingAccount(50000.00);
        System.out.println("Account2 has a starting balance of $" + checkingAcc2.getBalance());
        System.out.println("Withdraw $6000.00");
        checkingAcc2.withdraw(60000.00);
        System.out.println("After a withdrawal of $6,000, the balance is still $" + checkingAcc2.accountBalance +"\n"); // Expected output: $50,000
        
        CheckingAccount checkingAcc3 = new CheckingAccount(1900.00);
        System.out.println("Account3 has a starting balance of $" + checkingAcc3.getBalance());
        System.out.println("Withdraw $1900.00");
        checkingAcc3.withdraw(1900.00);
        System.out.println("After a withdrawal of $1,9000, the balance is $" + checkingAcc3.accountBalance +"\n"); // Expected output: $-25

        CheckingAccount checkingAcc4 = new CheckingAccount(99.00);
        System.out.println("Account4 has a starting balance of $" + checkingAcc4.getBalance());
        System.out.println("Withdraw $10.00");
        checkingAcc4.withdraw(10.00);
        System.out.println("After a withdrawal of $10, the balance is $" + checkingAcc4.accountBalance +"\n"); // Expected output: $64
        

    }
}