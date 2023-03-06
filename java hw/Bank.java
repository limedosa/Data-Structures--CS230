
/**
 * Holds the different bank accounts in an array.
 *
 * @author (Shawfong Hsu, Linda Dominguez)
 * @version (2/27/23)
 */
public class Bank {
    private Account[] accounts; // array of accounts 
    private int count; // number of accs
    private double totalFunds = 0.0;

    /**
     * Constructor for objects of Bank class
     */
    public Bank()
    {
        accounts = new Account[count];
        count = 0;
    }
    /**
     * Adding the different accounts into the account Account array 
     */

    public void addAccount(Account newAccount){
        accounts[count] = newAccount;
        count++;

    }
    /**
     * Calculating the total funds of the accounts that have been added to the array
     */
    public double calculateTotalFunds() {
        //loop though all the accs both saving and checking though the array
        for (int i = 0; i < accounts.length;i++){
            Account account = accounts[i];
            totalFunds += account.getBalance();
        }
        return totalFunds; 
        
    }
    /**
     * returns a string representation of the bank and how many acoutns inside
     */

    public String toString(){
        String bankReport = "";
        bankReport += "This bank current holds " + count + "accounts in it. \n";
        for( int i =0; i < count; i++ ){
            bankReport += accounts[i] + "\n";
        }
        return bankReport; 
    }
    /**
     * For testing 
     */

    public static void main(String[] args) {
        //testing
        Bank bank = new Bank();
        CheckingAccount accountBank1 = new CheckingAccount(1000);
        bank.addAccount(accountBank1);
        SavingAccount accountBank2 = new SavingAccount(500);
        bank.addAccount(accountBank2);
        System.out.println("hi");
    }

}
