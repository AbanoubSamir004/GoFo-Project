
/**
 *
 * @author marina,abanoub,abanoub
 * class User
 */
public class User {
    private String firstName,lastName,email,userName,password,mobileNumber,adderss;
    private double balance;
    public Playground playground;
    public PlaygroundOwner playgroundOwner;
    /**
     * Default constructor to initiate firstName,lastName,email,userName,password,mobileNumber,address,balance
     */
    public User(){
        firstName = "";
        lastName = "";
        email = "";
        userName = "";
        password = "";
        mobileNumber = "";
        adderss = "";
        balance=0;
    }
    /**
     * parameterized constructor to assign firstName,lastName,email,userName,password,mobileNumber,address,balance
     * @param firstName
     * @param lastName
     * @param email
     * @param userName
     * @param password
     * @param mobileNumber
     * @param adderss
     */
    public User(String firstName, String lastName, String email, String userName, String password, String mobileNumber, String adderss) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.adderss = adderss;
    }
    /**
     * Function setBalance is a method that updates the value of balance
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * Function setPlayground is a method that updates the value of playground
     * @param playground
     */

    public void setPlayground(Playground playground){
        this.playground=playground;
    }
    /**
     * Function setFirstName is a method that updates the value of firstName
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Function setLastName is a method that updates the value of lastName
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Function setEmail is a method that updates the value of email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Function setUserName is a method that updates the value of userName
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * Function setPassword is a method that updates the value of password
     * @param password
     */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * Function setMobileNumber is a method that updates the value of mobileNumber
     * @param mobileNumber
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    /**
     * Function setAdderss is a method that updates the value of adderss
     * @param adderss
     */

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }
    /**
     * Function getFirstName is a method that reads the value of firstName
     * @return firstName
     */

    public String getFirstName() {
        return firstName;
    }
    /***
     * Function getLastName is a method that reads the value of lastName
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }
    /***
     * Function getEmail is a method that reads the value of email
     * @return email
     */
    public String getEmail() {
        return email;
    }
    /***
     * Function getUserName is a method that reads the value of userName
     * @return userName
     */
    public String getUserName() {
        return userName;
    }
    /***
     * Function getPassword is a method that reads the value of password
     * @return password
     */
    public String getPassword() {
        return password;
    }
    /***
     * Function getMobileNumber is a method that reads the value of mobileNumber
     * @return mobileNumber
     */
    public String getMobileNumber() {
        return mobileNumber;
    }
    /***
     * Function getAdderss is a method that reads the value of adderss
     * @return adderss
     */
    public String getAdderss() {
        return adderss;
    }
    /***
     * Function getBalance is a method that reads the value of balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }
    /***
     * Function getPlayground is a method that reads the value of playground
     * @return playground
     */
    public Playground getPlayground() {
        return playground;
    }
}