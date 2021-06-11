import java.util.Scanner;
/**
 * This is a small main class to test the classes and it is responsible for maintain a GoFo program and allow the player and the playground owner to login and allow the player to book a playground and also allow the playground owner to add his playgrounds.
 * @author Janet Emad Samir Fahmy
 * @author Youssef Taha Mohamed
 * @version 1.0
 * @since 11 June 2021
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        String username;
        String password;


        System.out.println("Welcome to GoFo program!");
        System.out.println("Do you want to login as Player or Playground Owner?\nPlease enter '1' if you are a player or '2' if you are a playground owner.\n");
        System.out.println("Your Choice: ");
        choice = Integer.parseInt(input.nextLine());

        System.out.println("\nEnter your username and password to login to your account.");
        System.out.println("Username: ");
        username = input.nextLine();

        System.out.println("Password: ");
        password = input.nextLine();

        login login1 = new login(username, password);

        if(choice==1){
            if (login.checkPasswordforPlayer())
            {
                System.out.println("You are logged in successfully!");
                list l1 = new list();
                playgroundOwner po2 = new playgroundOwner("youssef", "fisa");
                playground pg1 = new playground("ground1", 123, "sdfa", "hh", 54);
                playground pg2 = new playground("ground2", 456, "helwan", "tt", 54);

                po2.addGround(pg1, l1);
                po2.addGround(pg2, l1);
                po2.display();

                Player p1 = new Player("youssef", "sdfa", 1, "23451", "fsda");
                Player p2 = new Player("omar", "sdfa", 2, "5344451", "fasfdsdfaa");
                p1.book(l1);
                p2.book(l1);
            }
            else
                System.out.println("Login failed! The username or password is incorrect.");
        }
        else if(choice==2) {
            if (login.checkPasswordforPlaygroundOwner())
            {
                System.out.println("You are logged in successfully!");
                list l1 = new list();
                playgroundOwner po2 = new playgroundOwner("youssef", "fisa");
                playground pg1 = new playground("ground1", 123, "sdfa", "hh", 54);
                playground pg2 = new playground("ground2", 456, "helwan", "tt", 54);

                po2.addGround(pg1, l1);
                po2.addGround(pg2, l1);
                po2.display();

                Player p1 = new Player("youssef", "sdfa", 1, "23451", "fsda");
                Player p2 = new Player("omar", "sdfa", 2, "5344451", "fasfdsdfaa");
                p1.book(l1);
                p2.book(l1);
            }
            else
                System.out.println("Login failed! The username or password is incorrect.");
        }

    }
}
