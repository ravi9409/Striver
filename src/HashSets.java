import java.util.HashSet;

public class HashSets {
    public static void main(String args[])
    {
        // Creating an empty HashSet
        HashSet set = new HashSet();
        System.out.println(set.add("Welcome"));
        // Use add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");

        // Displaying the HashSet
        System.out.println("HashSet: " + set);
        System.out.println();
    }
}