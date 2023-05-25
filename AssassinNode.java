public class AssassinNode {
    //You will write a java class AssassinNode that represents a single node in a linked list for a game of
    //Assassin: player name, killer name, and reference to next node.

    //Instance variables
    public String data; // name stored in node
    public AssassinNode front; // front of the list
    public AssassinNode next; // link to next node
    public AssassinNode(String name) { // constructor; what a node consists of
        this.data = name;
        this.next = null;
    } // end AssassinNode()

    // some functions
    public String getName() {
        return data;
    } // end getName()

    public void setName(String name) {
        this.data = data;
    } // end setName()

    public AssassinNode getNext() {
        return next;
    } // end getNext()

    public void setNext(AssassinNode next) {
        this.next = next;
    } // end setNext()
} // end class
