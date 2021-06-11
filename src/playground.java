import java.util.*;
public class playground {
    private String playgroundName;
    private float size;
    private String location;
    private String typeofGrass;
    private float price;
    private playgroundOwner owner1=new playgroundOwner();
    protected int hours [] =new int [24];


    public void setOwner1(playgroundOwner owner1) {
        this.owner1 = owner1;
    }

    public playgroundOwner getOwner1() {
        return owner1;
    }


    public void setHours(int[] hours) {
        this.hours = hours;
    }

    public int[] getHours() {
        return hours;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPlaygroundName(String playgroundName) {
        this.playgroundName = playgroundName;
    }

    public String getPlaygroundName() {
        return playgroundName;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getSize() {
        return size;
    }


    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }

    public void setTypeofGrass(String typeofGrass) {
        this.typeofGrass = typeofGrass;
    }

    public String getTypeofGrass() {
        return typeofGrass;
    }

    public playground() {
        this.playgroundName = "";
        this.size = 0;
        this.location = "";
        this.typeofGrass = "";
    }

    public playground(String playgroundName, int size, String location, String typeofGrass,float price) {
        this.playgroundName = playgroundName;
        this.size = size;
        this.location = location;
        this.typeofGrass = typeofGrass;
        this.price=price;
    }
    /*public void check()
    {
        for(int i=0 ;i<24 ;i++) {
            if (hours[i]!=0) {
                System.out.println("Not Available");
            }
            else{
                System.out.println("Not Available");
            }
        }
    }*/

    @Override
    public String toString() {
        return "playground{" +
                "playgroundName='" + playgroundName + '\'' +
                ", size=" + size +
                ", location='" + location + '\'' +
                ", typeofGrass='" + typeofGrass + '\'' +
                ", price=" + price +
                '}';
    }
}
