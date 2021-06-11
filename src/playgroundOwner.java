import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is responsible for the playground owner and it contains all the information about him and allow him to add a playground.
 */
public class playgroundOwner {
    /**
     * Private attributes
     */
    private String userName;
    private String password;


    protected ArrayList<playground> arr1=new ArrayList<playground>();

    /**
     * Default constructor
     */
    public playgroundOwner() {
        userName="";
        password="";
    }

    /**
     * Parameterized constructor
     * @param userName The username of the playground owner.
     * @param password The password of the playground owner account.
     */
    public playgroundOwner(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     * This function is responsible for adding a new playground to the owner's list of the playgrounds.
     * @param playground1 The new playground that the owner want to add it.
     * @param a1 The list of existing playgrounds.
     */
    public void addGround(playground playground1,list a1){
        arr1.add(playground1);
        a1.add(playground1);
    }

    /**
     * This function is responsible for modifying the information of the playground that is already has been added.
     * @param groundName The Name of the playground.
     * @param size The size of the playground.
     * @param loc The location of the playground.
     * @param type The type of grass of the playground.
     * @param price The price of booking the playground.
     */
    public void modifyGround(String groundName,int size, String loc,String type,float price){
        boolean temp=false;
        System.out.println("Please enter your playground name: ");
        Scanner input = new Scanner(System.in);
        String name;
        name=input.next();

        for(int i=0;i<arr1.size();i++){
            if(arr1.get(i).getPlaygroundName().equals(name)){
                arr1.get(i).setPlaygroundName(groundName);
                arr1.get(i).setSize(size);
                arr1.get(i).setLocation(loc);
                arr1.get(i).setTypeofGrass(type);
                arr1.get(i).setPrice(price);
                temp=true;
            }
        }
        if (temp==false){
            System.out.println("Wrong Name");
        }
    }

    /**
     * This function is responsible for printing the list of the playgrounds owned by this owner.
     */
    public void display(){
        System.out.println(arr1);
    }
}
