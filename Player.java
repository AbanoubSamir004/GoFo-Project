import java.util.Scanner;

/**
 *
 * @author marina,abanoub,abanoub
 * Class Player
 */
public class Player extends User {
    public double balance;
    public Ewallet ewallet=new Ewallet();
    /**
     * Default constructor to initiate balance
     *
     */
    public Player() {
        balance=0;
    }

    int slot;
    /**
     * Function bookPlayground is a method that allows the player to book the playground
     * @param obj
     * @return slot
     */
    public int bookPlayground( Playground obj) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter playground number you want to book");
        int index = input.nextInt();
        if (obj.getPlaygroundNumber()==index){
            System.out.println("please enter time you want to play at");
            index = input.nextInt();
            for (int i = 0; i < obj.Array.length; i++) {
                if (obj.Array[i] == index) {
                    slot=obj.Array[i] ;
                    obj.Array[i] =-1;//will book
                    return slot;
                }
            }
        }
        else {
            slot=-1;
            System.out.println("Wrong Playground Number");
        }
        return slot;
    }

    /**
     *  Function setBalance is a method that updates the value of balance
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * Function getBalance is the method that reads the value of balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }
}


