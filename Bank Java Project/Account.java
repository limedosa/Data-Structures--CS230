import java.text.NumberFormat;
/**
 * 
 * @author (Shawfong, linda)
 * @version (2/25/23)
 */

public abstract class Account
{
    protected int accountNumber; // speical num 
    protected double accountBalance; // how much money 
    private int numAcc = 0; // which acc 
    // private double accountRate;

    /**
     * initial deposit of money into any acc created 
     */
    public Account(double balance){
        // accountNumber = accNumber; 
        accountNumber = numAcc;
        numAcc += 2;
        accountBalance = balance; 
    }
    /**
     * Gets the acc balance 
     */
    public double getBalance(){
        return accountBalance; 
    }
        /**
    //  * Gets the acc rate 
    //  */
    // public double getRate(){
    //     return accountRate; 
    // }
    // /**
    //  * @param int amount of money that goes into account when it's created 
    //  * creates a new bank account using entered deposits 
    //  */
    // public Account(double initialDeposit){
    //     accBalance = initialDeposit;
    //     accountNumber = numAcc+1;
    //     numAcc++;
    // }
    
    /**
     * @param double of how much money to add into the bank acc
     * depositing the money into account 
     */
    public final void deposit(double amount){
        accountBalance += amount;
    }
    /**
     * returns a string representation of the newly created bank account 
     */
    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String accountReport = "Bank account number: " + accountNumber + "\n Balance: "
        + fmt.format(accountBalance);
        return accountReport;
    }
    /**
     * @param double amount of money to withdraw, abstract method to be used in checking
     * and saving account 
     * 
     */
    public abstract void withdraw(double amount);
    /**
     * Testing cannot be done on this-- which is why the test are commented out
     */
    // public static void main(String[] args) {
        //testing
        // Account account1 = new Account (1290, 120.00)
        // System.out.println("Account Num: " + accountNumber +"has $" + accBalance);


    // }

}
