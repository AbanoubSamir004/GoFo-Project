import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author marina,abanoub,abanoub
 * class Playground
 */
public class Playground  {

    private int playgroundNumber, startingHour, endingHour;
    private double pricePerHour;
    private String playgroundName, address;
    int size;
    int[] Array;
    public User user;
    /**
     * Default constructor to initiate playgroundNumber,startingHour,endingHour,pricePerHour,playgroundName,address
     */
    public Playground() {
        playgroundNumber = 0;
        startingHour = 0;
        endingHour = 0;
        pricePerHour = 0;
        playgroundName = "";
        address = "";
    }
    /**
     * parameterized constructor to assign playgroundNumber,startingHour,endingHour,pricePerHour,playgroundName,address 
     * @param playgroundNumber
     * @param startingHour
     * @param endingHour
     * @param pricePerHour
     * @param playgroundName
     * @param address
     */
    public Playground(int playgroundNumber, int startingHour, int endingHour,
                      double pricePerHour, String playgroundName, String address) {
        this.playgroundNumber = playgroundNumber;
        this.startingHour = startingHour;
        this.endingHour = endingHour;
        this.pricePerHour = pricePerHour;
        this.playgroundName = playgroundName;
        this.address = address;
    }
    /**
     * Function thats allows for playgroundOwner to add playground
     * playgroundOwner enter all info to add playground
     */
    public void addPlaygrounds() {
        Scanner input = new Scanner(System.in);
        String data;
        int data2;
        double data3;
        System.out.println("Please Enter Playground Number");
        data2 = input.nextInt();
        setPlaygroundNumber(data2);

        System.out.println("Please Enter Playground Name");
        data = input.next();
        setPlaygroundName(data);


        System.out.println("Please Enter Playground Address");
        data = input.next();
        setAddress(data);


        System.out.println("Please Enter playground Time slots");

        System.out.println("please enter the Starting Hour");
        data2 = input.nextInt();
        setStartingHour(data2);

        System.out.println("please enter the Ending Hour");
        data2 = input.nextInt();
        setEndingHour(data2);
        size = getEndingHour() - getStartingHour() + 1;
        int start = getStartingHour();
        Array = new int[size];
        for (int i = 0; i < size; i++) {
            Array[i] = start;
            start++;
        }
        System.out.println("Please Enter Playground Price Per Hour");
        data3 = input.nextDouble();
        setPricePerHour(data3);
    }
    /**
     * Function setPlaygroundNumber is a method that updates the value of playgroundNumber
     * @param playgroundNumber
     */
    public void setPlaygroundNumber(int playgroundNumber) {
        this.playgroundNumber = playgroundNumber;
    }
    /**
     * Function setStartingHour is a method that updates the value of startingHour
     * @param startingHour
     */
    public void setStartingHour(int startingHour) {
        this.startingHour = startingHour;
    }
    /**
     * Function setEndingHour is a method that updates the value of endingHour
     * @param endingHour
     */
    public void setEndingHour(int endingHour) {
        this.endingHour = endingHour;
    }
    /**
     * Function setPricePerHour is a method that updates the value of pricePerHour
     * @param pricePerHour
     */
    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
    /**
     * Function setPlaygroundName is a method that updates the value of playgroundName
     * @param playgroundName
     */
    public void setPlaygroundName(String playgroundName) {
        this.playgroundName = playgroundName;
    }
    /**
     * Function setAddress is a method that updates the value of address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * Function getPlaygroundNumber is a method that reads the value of playgroundNumber
     * @return playgroundNumber
     */
    public int getPlaygroundNumber() {
        return playgroundNumber;
    }
    /**
     * Function getStartingHour is a method that reads the value of startingHour
     * @return startingHour
     */
    public int getStartingHour() {
        return startingHour;
    }
    /**
     * Function getEndingHour is a method that reads the value of endingHour
     * @return endingHour
     */
    public int getEndingHour() {
        return endingHour;
    }
    /**
     * Function getPricePerHour is a method that reads the value of pricePerHour
     * @return pricePerHour
     */
    public double getPricePerHour() {
        return pricePerHour;
    }
    /**
     * Function getPlaygroundName is a method that reads the value of playgroundName
     * @return playgroundName
     */
    public String getPlaygroundName() {
        return playgroundName;
    }
    /**
     * Function getAddress is a method that reads the value of address
     * @return address
     */
    public String getAddress() {
        return address;
    }
    /**
     * override function from class object that read information about playground
     * @return
     */
    @Override
    public String toString() {
        return "Playground{" +
                "playgroundNumber: " + playgroundNumber +
                ", playgroundName: '" + playgroundName + '\'' +
                ", startingHour: " + startingHour +
                ", endingHour=" + endingHour +
                ", pricePerHour: " + pricePerHour +
                ", address: '" + address + '\'' +
                ", Time Slots: " + Arrays.toString(Array) +
                '}';
    }
}