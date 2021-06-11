import java.util.ArrayList;
import java.util.Scanner;
public class playgroundOwner {
    private String userName;
    private String password;


    protected ArrayList<playground> arr1=new ArrayList<playground>();

    public playgroundOwner() {
        userName="";
        password="";
    }

    public playgroundOwner(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void addGround(playground playground1,list a1){
        arr1.add(playground1);
        a1.add(playground1);
    }
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
    public void display(){
        System.out.println(arr1);
    }
}
