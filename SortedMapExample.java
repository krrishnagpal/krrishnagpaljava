import java.util.*;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();

        // Insertion
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        // Deletion
        map.remove(1);

        // Updation
        map.put(2, "Z");

        System.out.println(map); // Sorted by keys
    }
}