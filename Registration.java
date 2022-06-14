import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marina,abanoub,abanoub
 * Class Registration that Control all Our Program
 */
public class Registration extends User {
    static ArrayList<User> players = new ArrayList<User>();
    User playgroundOwners = new User();

    static int count1 = 0, count2 = 0;
    Scanner input = new Scanner(System.in);
    int options, check, slot;
    double price;
    static int listIndex;

    /**
     * Function that shows the options for the player and the owner of playground
     */
    public void Menu() {
        while (true) {
            User user = new User();

            String data;
            System.out.println("1- Sign Up");
            System.out.println("2- Sign In");
            System.out.println("3- Exit");
            /**
             * to create new account
             */
            options = input.nextInt();


            /**
             * create new account for playgroundOwner and enter all information
             */
            if (options == 1) {
                System.out.println("1- Register as PlaygroundOwner");
                System.out.println("2- Register as Player");
                check = input.nextInt();
                if (check == 1) {
                    System.out.println("Please Enter firstName");
                    data = input.next();
                    playgroundOwners.setFirstName(data);
                    System.out.println("Please Enter lastName");
                    data = input.next();
                    playgroundOwners.setLastName(data);

                    System.out.println("Please Enter userName");
                    data = input.next();
                    playgroundOwners.setUserName(data);

                    System.out.println("Please Enter password");
                    data = input.next();
                    playgroundOwners.setPassword(data);

                    System.out.println("Please Enter phone");
                    data = input.next();
                    playgroundOwners.setMobileNumber(data);

                    System.out.println("Please Enter email");
                    data = input.next();
                    playgroundOwners.setEmail(data);

                    System.out.println("Please Enter Address");
                    data = input.next();
                    playgroundOwners.setAdderss(data);
                    Playground playground = new Playground();
                    playgroundOwners.setPlayground(playground);
                    playgroundOwners.setBalance(0);
                }
                /**
                 * create new account for player and enter all information
                 */
                else if (check == 2) {
                    System.out.println("Please Enter firstName");
                    data = input.next();
                    user.setFirstName(data);
                    System.out.println("Please Enter lastName");
                    data = input.next();
                    user.setLastName(data);

                    System.out.println("Please Enter userName");
                    data = input.next();
                    user.setUserName(data);

                    System.out.println("Please Enter password");
                    data = input.next();
                    user.setPassword(data);

                    System.out.println("Please Enter phone");
                    data = input.next();
                    user.setMobileNumber(data);

                    System.out.println("Please Enter email");
                    data = input.next();
                    user.setEmail(data);

                    System.out.println("Please Enter Address");
                    data = input.next();
                    user.setAdderss(data);

                    System.out.println("Please Enter Balance");
                    double money;
                    money = input.nextDouble();
                    players.add(count1, user);
                    players.get(count1).setBalance(money);

                    count1++;
                }
            }
            /**
             * to login account already exists
             */
            else if (options == 2) {
                System.out.println("1- Login as PlaygroundOwner");
                System.out.println("2- Login as Player");
                check = input.nextInt();

                System.out.println("Please Enter username");
                data = input.next();
                String data2;
                System.out.println("Please Enter Password");
                data2 = input.next();
                /**
                 * to login account for playgroundOwners
                 */

                if (check == 1) {
                    if ((playgroundOwners.getUserName().equals(data)) && (playgroundOwners.getPassword().equals(data2))) {
                        listIndex = 1;

                    }
                    if (listIndex == 1) {
                        //Playground
                        System.out.println("Please Add Your Playground: ");
                        Playground playground = new Playground();
                        playground.addPlaygrounds();
                        user.setPlayground(playground);
                        user.setBalance(0);
                        playgroundOwners.setPlayground(playground);

                        price = playground.getPricePerHour();
                    } else {
                        System.out.println("User Not Found");
                    }
                }
                /**
                 * to login account for playgroundOwners
                 */
                else if (check == 2) {
                    int index = 0;
                    for (int i = 0; i < players.size(); i++) {
                        if ((players.get(i).getUserName().equals(data)) && (players.get(i).getPassword().equals(data2))) {
                            listIndex = 2;
                            index = i;
                        }
                    }
                    if (listIndex == 2) {
                        //Playground
                        System.out.println("Playground info");
                        listMyPlayground();
                        Player player = new Player();
                        slot = player.bookPlayground(playgroundOwners.getPlayground());

                        if (slot!=-1) {
                            Ewallet ewallet = new Ewallet(players.get(index).getBalance());
                            players.get(index).setBalance(ewallet.withdraw(price));

                            Ewallet ewallet2 = new Ewallet(playgroundOwners.getBalance());
                            playgroundOwners.setBalance(ewallet2.deposit(price));
                        }
                    } else {
                        System.out.println("User Not Found");
                    }
                    listALLPlayers(index);
                }
            }
            /**
             * for exit from loop
             */
            else if (options == 3) {
                break;
            }

            System.out.println("**********************************");
        }
        listALLPlayers();
        listMyPlayground();
    }
    /**
     * Function thats reads list of players by index
     */
    public void listALLPlayers(int index){
        if(index<=players.size()) {
            System.out.println("Player " + (index + 1) + ": " + "\n" + "First Name: " + players.get(index).getFirstName() + "\n" +
                    "Last Name: " + players.get(index).getLastName() + "\n" +
                    "Address: " + players.get(index).getAdderss() + "\n" +
                    "Phone: " + players.get(index).getMobileNumber() + "\n" +
                    "Email: " + players.get(index).getEmail() + "\n"
                    + "MY Ewallet: " + players.get(index).getBalance() + "\n" +
                    "Time Slot : " + slot + "\n");
        }
    }
    /**
     * Function thats reads list of players
     */
    public void listALLPlayers() {
        for (int i = 0; i < players.size(); i++) {

            System.out.println("Player " + (i + 1) + ": " + "\n" + "First Name: " + players.get(i).getFirstName() + "\n" +
                    "Last Name: " + players.get(i).getLastName() + "\n" +
                    "Address: " + players.get(i).getAdderss() + "\n" +
                    "Phone: " + players.get(i).getMobileNumber() + "\n" +
                    "Email: " + players.get(i).getEmail() + "\n"
                    + "MY Ewallet: " + players.get(i).getBalance() + "\n" +
                    "Time Slot : " + slot + "\n");

        }
    }
    /**
     * Function thats reads list of ALLPlaygroundOwner Information
     */
    public void listALLPlaygroundOwnerInfo () {

        System.out.println("Playground Owner " + ": " + "\n" + "first Name: " + playgroundOwners.getFirstName() + "\n" +
                "Last Name: " + playgroundOwners.getLastName() + "\n" +
                "Address: " + playgroundOwners.getAdderss() + "\n" +
                "Phone: " + playgroundOwners.getMobileNumber() + "\n" +
                "Email: " + playgroundOwners.getEmail() + "\n"
                + "MY Ewallet: " + playgroundOwners.getBalance() + "\n"
                + playgroundOwners.getPlayground());
    }
    /**
     * Function thats reads list of ALLPlaygrounds Information
     */
    public void listMyPlayground () {

        System.out.println(playgroundOwners.getPlayground());
    }

}
