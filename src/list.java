import java.util.ArrayList;

/**
 * This class is responsible for storing the list of the playgrounds.
 */
public class list {
    ArrayList<playground> grounds=new ArrayList<playground>();

    /**
     * This function is responsible for adding a playground in the list of playgrounds.
     * @param ground The playground that will be added to the list.
     */
    public void add(playground ground){
        grounds.add(ground);
    }

}