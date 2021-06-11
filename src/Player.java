import java.util.*;
import java.util.Scanner;

public class Player {
    Scanner input = new Scanner(System.in);
    private String userName;
    private String password;
    private String phoneNumber;
    private String address;
    private int id;



    public Player(String userName,String password ,int id, String phoneNumber, String address) {
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.id=id;
    }

    public Player(){
        userName="";
        password="";
        phoneNumber="";
        address="";

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  void book(list a2) {
        String name;
        System.out.println("enter playground name:");
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
