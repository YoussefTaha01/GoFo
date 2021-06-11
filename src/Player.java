import java.util.Scanner;

/**
 * This class is responsible for tha player and it contains all the information about him and allow him to book a playground.
 */
public class Player {
    Scanner input = new Scanner(System.in);
    /**
     * Private attributes
     */
    private String userName;
    private String password;
    private String phoneNumber;
    private String address;
    private int id;

    /**
     * Parameterized constructor
     * @param userName The username of the player.
     * @param password The password of the account of the player.
     * @param id The id of the player.
     * @param phoneNumber The phone number of the player.
     * @param address The address of the player.
     */
    public Player(String userName,String password ,int id, String phoneNumber, String address) {
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.id=id;
    }

    /**
     * Default constructor
     */
    public Player(){
        userName="";
        password="";
        phoneNumber="";
        address="";

    }

    /**
     * This is the getter for id to get the value from it.
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * This is the setter for id to set the value to it.
     * @param id The id of the player.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * This is the getter for username to get the value from it.
     * @return username
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This is the getter for password to get the value from it.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * This is the setter for password to set the value to it.
     * @param password The password of the account of the player.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This is the setter for username to set the value to it.
     * @param userName The username of the player.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This is the getter for phoneNumber to get the value from it.
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This is the setter for phoneNumber to set the value to it.
     * @param phoneNumber The phone number of the player.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * This is the getter for address to get the value from it.
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * This is the setter for address to set the value to it.
     * @param address The address of the player.
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * This function is responsible for the playground booking process.
     * @param a2 The list of the playgrounds.
     */
    public  void book(list a2) {
        String name;
        System.out.println("please enter playground name you want to book in:");
        name = input.next();
        int tmp=-1;
        for (int i = 0; i < a2.grounds.size(); i++) {
            if (a2.grounds.get(i).getPlaygroundName().equals(name)) {
                tmp=i;
            }
        }
        if(tmp==-1){
            System.out.println("there is no playground with this name");
        }
        else{
            int slot;
            System.out.println("enter playground slot time:");
            slot = input.nextInt();
            if(a2.grounds.get(tmp).hours[slot-1]==0){
                a2.grounds.get(tmp).hours[slot-1]=id;
                System.out.println("you booked slot "+slot+" successfully.");
            }
            else{
                System.out.println("slot not available");
            }
        }
    }
}