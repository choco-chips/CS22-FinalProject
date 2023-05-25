import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AssassinMain {
    //You will write a client program called AssassinMain. It should read a file of names and construct an
    //object of your class AssassinManager. This main program will ask the user for the names of each victim
    //to assassinate until there is just one player left alive (at which point the game is over and the last
    //remaining player wins). AssassinMain calls methods of the AssassinManager class to carry out the tasks
    //involved in administering the game.
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("names.txt");
            List<String> names = fileToList(file);
//            for(String i : names) { // debug; check if file was read and print contents
//                System.out.println(i);
//            }
            AssassinManager manager = new AssassinManager();
            manager.AssassinManager(names);
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
    } // end main

    public static List<String> fileToList(FileReader file) { // load file contents into a returned LinkedList
        Scanner read = new Scanner(file);
        List<String> names = new LinkedList<>();
        int index = 0;
        while(read.hasNextLine()) {
            String line = read.nextLine();
            names.add(line);
            index++;
        }
        return names;
    } // end fileToList()
} // end class
