
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author marina,abanoub,abanoub
 *  Class PlaygroundOwner
 */
public class PlaygroundOwner extends User{
    public Ewallet ewallet=new Ewallet();
    public double balance;
    public Playground playground;
    public User user;
    /**
     *  Function setPlayground is a method that updates the value of playground
     * @param playground
     */
    public void setPlayground(Playground playground){
        this.playground=playground;
    }
    /**
     * Function playgroundPrice is a method that updates the value of balance
     * @param balance
     */
    public void playgroundPrice(double balance) {
        this.balance = balance;
    }
    /**
     * Function getPlaygroundPrice is a method that reads the value of balance
     * @return balance
     */
    public double getPlaygroundPrice() {
        return balance;
    }
}