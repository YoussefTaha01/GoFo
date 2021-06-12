import java.util.*;

/**
 * This class is responsible for the playground and it contains all the information about it.
 */
public class playground {
    /**
     * Private attributes
     */
    private String playgroundName;
    private float size;
    private String location;
    private String typeofGrass;
    private float price;

    private playgroundOwner owner1=new playgroundOwner();
    protected int hours [] =new int [24];


    /**
     * This is the setter for owner1 (object from playgroundOwner).
     * @param owner1 This is object from the playgroundOwner.
     */
    public void setOwner1(playgroundOwner owner1) {
        this.owner1 = owner1;
    }

    /**
     * This is the getter for owner1 (object from playgroundOwner).
     * @return owner1
     */
    public playgroundOwner getOwner1() {
        return owner1;
    }


    /**
     * This is the setter for hours to set the value to it.
     * @param hours Hours available for the playground to be booked.
     */
    public void setHours(int[] hours) {
        this.hours = hours;
    }

    /**
     * This is the getter for hours to get the value from it.
     * @return hours
     */
    public int[] getHours() {
        return hours;
    }

    /**
     * This is the setter for price to set the value to it.
     * @param price Price of the book of the playground.
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * This is the getter for price to get the value from it.
     * @return price
     */
    public float getPrice() {
        return price;
    }

    /**
     * This is the setter for playgroundName to set the value to it.
     * @param playgroundName The name of the playground.
     */
    public void setPlaygroundName(String playgroundName) {
        this.playgroundName = playgroundName;
    }

    /**
     * This is the getter for playgroundName to get the value from it.
     * @return playgroundName
     */
    public String getPlaygroundName() {
        return playgroundName;
    }

    /**
     * This is the setter for size to set the value to it.
     * @param size The size of the playground.
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * This is the getter for size to get the value from it.
     * @return size
     */
    public float getSize() {
        return size;
    }

    /**
     * This is the setter for location to set the value to it.
     * @param location The location of the playground.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * This is the getter for location to get the value from it.
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * This is the setter for typeofGrass to set the value to it.
     * @param typeofGrass The type of grass of the playground.
     */
    public void setTypeofGrass(String typeofGrass) {
        this.typeofGrass = typeofGrass;
    }

    /**
     * This is the getter for typeofGrass to get the value from it.
     * @return typeofGrass
     */
    public String getTypeofGrass() {
        return typeofGrass;
    }

    /**
     * Default constructor
     */
    public playground() {
        this.playgroundName = "";
        this.size = 0;
        this.location = "";
        this.typeofGrass = "";
    }

    /**
     * Parameterized constructor
     * @param playgroundName The Name of the playground.
     * @param size The size of the playground.
     * @param location The location of the playground.
     * @param typeofGrass The type of grass of the playground.
     * @param price The price of booking the playground.
     */
    public playground(String playgroundName, int size, String location, String typeofGrass,float price) {
        this.playgroundName = playgroundName;
        this.size = size;
        this.location = location;
        this.typeofGrass = typeofGrass;
        this.price=price;
    }


    /**
     * This function is responsible for returning all the information of the playground.
     * @return All the information of the playground
     */
    @Override
    public String toString() {
        return "playground: {" +
                "playgroundName='" + playgroundName + '\'' +
                ", size=" + size +
                ", location='" + location + '\'' +
                ", typeofGrass='" + typeofGrass + '\'' +
                ", price=" + price +
                "}\n";
    }
}
