import java.util.Scanner;

/**
 * This class is responsible for the login process.
 */
public class login
{
    /**
     * Private attributes
     */
    private static String username;
    private static String password;


    private static String[][] playersAccounts = {{"janet", "12345"},{"youssef", "678910"}};
    private static String[][] playgroundOwnersAccounts = {{"salma", "11121314"},{"emad", "15161718"}};

    /**
     * Parameterized constructor
     * @param username Username of the user who want to login whether if player or playground owner.
     * @param password Password of the account of user.
     */
    public login(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    /**
     * This function will check if the username and password that the playground owner entered is true or not.
     * @return true if the username and password is true and false if they are not.
     */
    public static boolean checkPasswordforPlaygroundOwner()
    {

        if(((username.equals(playgroundOwnersAccounts[0][0])) && (password.equals(playgroundOwnersAccounts[0][1])))||((username.equals(playgroundOwnersAccounts[1][0])) && (password.equals(playgroundOwnersAccounts[1][1])))){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * This function will check if the username and password that the player entered is true or not.
     * @return true if the username and password is true and false if they are not.
     */
    public static boolean checkPasswordforPlayer()
    {

        if(((username.equals(playersAccounts[0][0])) && (password.equals(playersAccounts[0][1])))||(username.equals(playersAccounts[1][0])) && (password.equals(playersAccounts[1][1]))){
            return true;
        }
        else{
            return false;
        }
    }
}
