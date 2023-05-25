import java.util.LinkedList;
import java.util.List;

public class AssassinManager {
    //You will write a java class AssassinManager that keeps track of who is stalking whom and the history
    //of who assassinated whom. You will maintain two linked lists: a list of people currently alive (the "kill
    //ring") and a list of those who have been assassinated (the "graveyard"). As people are assassinated, you
    //will move them from the kill ring to the graveyard by rearranging links between nodes. The game ends
    //when only one node remains in the kill ring, representing the winner.
    public void AssassinManager(List<String> names) {
        try {
            int size = names.size();
            LinkedList<String> killRing = new LinkedList<>();
            AssassinNode name = new AssassinNode(names.get(0));
            String current = name.getName(); // working on this - Justin
        } catch (IllegalArgumentException iae) {
            System.out.println("List is null or has size of 0");
        }
    } // end AssassinManager();

    public void printKillRing() {

    } // end printKillRing()

    public void printGraveyard() {

    } // end printGraveyard()

    public boolean killRingContains(String name) {
        return true;
    } // end killRingContains()

    public boolean graveyardContains(String name) {
        return true;
    } // end killRingContains()

    public boolean isGameOver() {
        return true;
    } // end isGameOver()

    public void kill(String name) {

    } // end kill()
} // end class
