import java.util.*;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();

        // Insertion
        set.add(30);
        set.add(10);
        set.add(20);

        // Deletion
        set.remove(10);

        // Updation (remove + add)
        set.remove(20);
        set.add(25);

        System.out.println(set); // Sorted output
    }
}