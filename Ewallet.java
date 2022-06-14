/**
 *
 * @author marina,abanoub,abanoub
 * Class Ewallet
 */
public class Ewallet {
    public double currentBalance=0;
    /**
     * Default constructor to initiate currentBalance
     *
     */
    public Ewallet(){
        currentBalance=0;
    }
    /**
     * parameterized constructor to assign currentBalance
     * @param currentBalance
     */
    public Ewallet(double currentBalance){
        this.currentBalance=currentBalance;
    }
    /**
     * deposit is a method that deposits money into the account
     * @param balance
     * @return currentBalance
     */

    public double deposit(double balance){
        currentBalance+=balance;
        return currentBalance;
    }

    /**
     * withdraw is a method that withdraw money from the account
     * @param balance
     * @return currentBalance
     */
    public double withdraw(double balance){
        currentBalance-=balance;
        return currentBalance;
    }
    /**
     * Function setCurrentBalance is a method that updates the value of currentBalance
     * @param currentBalance
     */
    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
    /**
     * Function getCurrentBalance is a method that reads the value of currentBalance
     * @return currentBalance
     */
    public double getCurrentBalance() {
        return currentBalance;
    }
}
